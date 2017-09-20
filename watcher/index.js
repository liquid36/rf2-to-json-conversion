var watch = require('node-watch');
var config = require('./config.private');

var timer = null;
watch(config.data_path, function (evt, name) {
    if (timer) {
        clearTimeout(timer);
    }

    timer = setTimeout(run, config.timeout);

});

function run() {
    const { exec } = require('child_process');
    var cmd = 'java -Xmx' + config.heap_size + 'g -jar '+ config.jar_file +' ' + config.config_file;
    console.log('Running ' + cmd);
    exec(cmd, (err, stdout, stderr) => {
      if (err) {
        // node couldn't execute the command
        console.log('Error procesando');
        process.stderr.write(stderr);
        return;
      }
    
      // the *entire* stdout and stderr (buffered)
      process.stderr.write(stdout);
    });
}