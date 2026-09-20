package com.spotify.genalphagraduation.graduationapi;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, m24212d2 = {"Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "GraduationTokenFetchException", "GraduationGeoIpMismatchException", "RuntimeDependenciesFetchException", "SaveCurrentUserException", "LogoutUserException", "Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException$GraduationGeoIpMismatchException;", "Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException$GraduationTokenFetchException;", "Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException$LogoutUserException;", "Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException$RuntimeDependenciesFetchException;", "Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException$SaveCurrentUserException;", "src_main_java_com_spotify_genalphagraduation_graduationapi-graduationapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class KidsGraduationException extends Exception {

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException$GraduationGeoIpMismatchException;", "Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException;", "src_main_java_com_spotify_genalphagraduation_graduationapi-graduationapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class GraduationGeoIpMismatchException extends KidsGraduationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException$GraduationTokenFetchException;", "Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException;", "src_main_java_com_spotify_genalphagraduation_graduationapi-graduationapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class GraduationTokenFetchException extends KidsGraduationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException$LogoutUserException;", "Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException;", "src_main_java_com_spotify_genalphagraduation_graduationapi-graduationapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class LogoutUserException extends KidsGraduationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException$RuntimeDependenciesFetchException;", "Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException;", "src_main_java_com_spotify_genalphagraduation_graduationapi-graduationapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class RuntimeDependenciesFetchException extends KidsGraduationException {
    }

    @Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException$SaveCurrentUserException;", "Lcom/spotify/genalphagraduation/graduationapi/KidsGraduationException;", "src_main_java_com_spotify_genalphagraduation_graduationapi-graduationapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class SaveCurrentUserException extends KidsGraduationException {
    }
}
