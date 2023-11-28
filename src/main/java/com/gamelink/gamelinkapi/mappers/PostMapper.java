package com.gamelink.gamelinkapi.mappers;

import com.gamelink.gamelinkapi.dtos.requests.posts.EventPostRequest;
import com.gamelink.gamelinkapi.dtos.requests.posts.PostRequest;
import com.gamelink.gamelinkapi.dtos.responses.posts.EventPostResponse;
import com.gamelink.gamelinkapi.dtos.responses.posts.PostResponse;
import com.gamelink.gamelinkapi.models.posts.EventPostModel;
import com.gamelink.gamelinkapi.models.posts.PostModel;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PostMapper {
    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);
    PostModel requestToModel(PostRequest postRequest);

    @Mapping(target = "imageUrl", source = "image.url")
    @Mapping(target = "postDate", source = "createdAt")
    @Mapping(target = "ownerId", source = "owner.user.id")
    @Mapping(target = "ownerName", source = "owner.name")
    @Mapping(target = "username", source = "owner.user.username")
    @Mapping(target = "userIconUrl", source = "owner.icon.url")
    PostResponse modelToResponse(PostModel postModel);

    EventPostModel requestToEventModel(EventPostRequest eventPostRequest);

    @Mapping(target = "imageUrl", source = "image.url")
    @Mapping(target = "postDate", source = "createdAt")
    @Mapping(target = "ownerId", source = "owner.user.id")
    @Mapping(target = "ownerName", source = "owner.name")
    @Mapping(target = "username", source = "owner.user.username")
    @Mapping(target = "userIconUrl", source = "owner.icon.url")
    EventPostResponse modelToEventResponse(EventPostModel eventPostModel);
}
