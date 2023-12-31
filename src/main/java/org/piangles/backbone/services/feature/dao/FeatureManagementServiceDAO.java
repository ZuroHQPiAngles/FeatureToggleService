package org.piangles.backbone.services.feature.dao;

import java.util.List;

import org.piangles.backbone.services.feature.Feature;
import org.piangles.backbone.services.feature.Group;
import org.piangles.backbone.services.feature.UpdateFeatureRequest;
import org.piangles.core.dao.DAOException;

public interface FeatureManagementServiceDAO
{
	public List<Group> getAllGroups() throws DAOException;
	
	public void addUserToGroup(String userId, String groupId) throws DAOException;
	public void removeUserFromGroup(String userId, String groupId) throws DAOException;

	public List<Feature> getAllActiveFeatures(String userId) throws DAOException;
	public List<Feature> getAllConfiguredFeatures(String userId) throws DAOException;
    void updateFeature(UpdateFeatureRequest request) throws DAOException;
	List<FeatureGroup> getAllFeatureGroups() throws DAOException;

}
