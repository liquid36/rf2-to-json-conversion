package org.ihtsdo.json;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by alo on 7/31/14.
 */
public class TransformerConfig {

    private String defaultTermLangCode;
    private String defaultTermDescriptionType;
    private String defaultTermLanguageRefset;
    private boolean normalizeTextIndex;
    private String editionName;
    private String databaseName;
    private String effectiveTime;
    private String expirationTime;
    private String outputFolder;
    private boolean createCompleteConceptsFile;
    private boolean processInMemory;

    private String host;
    private Integer port;

    private String user;
    private String admin;
    private String password;

    private HashSet<String> foldersBaselineLoad;
    private ArrayList<String> modulesToIgnoreBaselineLoad;

    private HashSet<String> foldersExtensionLoad;
    private ArrayList<String> modulesToIgnoreExtensionLoad;
	private String version;

    public TransformerConfig() {
        foldersBaselineLoad = new HashSet<String>();
        modulesToIgnoreBaselineLoad = new ArrayList<String>();
        foldersExtensionLoad = new HashSet<String>();
        modulesToIgnoreExtensionLoad = new ArrayList<String>();
    }

    public String getDefaultTermLangCode() {
        return defaultTermLangCode;
    }

    public void setDefaultTermLangCode(String defaultTermLangCode) {
        this.defaultTermLangCode = defaultTermLangCode;
    }

    public String getDefaultTermDescriptionType() {
        return defaultTermDescriptionType;
    }

    public void setDefaultTermDescriptionType(String defaultTermDescriptionType) {
        this.defaultTermDescriptionType = defaultTermDescriptionType;
    }

    public String getDefaultTermLanguageRefset() {
        return defaultTermLanguageRefset;
    }

    public void setDefaultTermLanguageRefset(String defaultTermLanguageRefset) {
        this.defaultTermLanguageRefset = defaultTermLanguageRefset;
    }

    public boolean isNormalizeTextIndex() {
        return normalizeTextIndex;
    }

    public void setNormalizeTextIndex(boolean normalizeTextIndex) {
        this.normalizeTextIndex = normalizeTextIndex;
    }

    public String getEditionName() {
        return editionName;
    }

    public void setEditionName(String editionName) {
        this.editionName = editionName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public HashSet<String> getFoldersBaselineLoad() {
        return foldersBaselineLoad;
    }

    public void setFoldersBaselineLoad(HashSet<String> foldersBaselineLoad) {
        this.foldersBaselineLoad = foldersBaselineLoad;
    }

    public ArrayList<String> getModulesToIgnoreBaselineLoad() {
        return modulesToIgnoreBaselineLoad;
    }

    public void setModulesToIgnoreBaselineLoad(ArrayList<String> modulesToIgnoreBaselineLoad) {
        this.modulesToIgnoreBaselineLoad = modulesToIgnoreBaselineLoad;
    }

    public HashSet<String> getFoldersExtensionLoad() {
        return foldersExtensionLoad;
    }

    public void setFoldersExtensionLoad(HashSet<String> foldersExtensionLoad) {
        this.foldersExtensionLoad = foldersExtensionLoad;
    }

    public ArrayList<String> getModulesToIgnoreExtensionLoad() {
        return modulesToIgnoreExtensionLoad;
    }

    public void setModulesToIgnoreExtensionLoad(ArrayList<String> modulesToIgnoreExtensionLoad) {
        this.modulesToIgnoreExtensionLoad = modulesToIgnoreExtensionLoad;
    }

    public String getOutputFolder() {
        return outputFolder;
    }

    public void setOutputFolder(String outputFolder) {
        this.outputFolder = outputFolder;
    }

    public boolean isCreateCompleteConceptsFile() {
        return createCompleteConceptsFile;
    }

    public void setCreateCompleteConceptsFile(boolean createCompleteConceptsFile) {
        this.createCompleteConceptsFile = createCompleteConceptsFile;
    }

    public boolean isProcessInMemory() {
        return processInMemory;
    }

    public void setProcessInMemory(boolean processInMemory) {
        this.processInMemory = processInMemory;
    }

	public void setVersion(String version) {
		this.version=version;
	}

	public String getVersion() {
		return version;
	}
}
