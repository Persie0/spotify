package com.spotify.jam.internal.socialconnect.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.gk60;
import p204p.j3n0;
import p204p.ok60;
import p204p.p301;
import p204p.qkg1;
import p204p.s571;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bd\b\u0087\b\u0018\u00002\u00020\u0001B§\u0002\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\b\b\u0003\u0010\u000e\u001a\u00020\f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0016\u001a\u00020\f\u0012\b\b\u0003\u0010\u0017\u001a\u00020\f\u0012\b\b\u0003\u0010\u0018\u001a\u00020\f\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0003\u0010\u001f\u001a\u00020\f\u0012\b\b\u0003\u0010 \u001a\u00020\f\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0003\u0010#\u001a\u00020\f\u0012\b\b\u0003\u0010$\u001a\u00020\f\u0012\n\b\u0003\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J°\u0002\u0010)\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0016\u001a\u00020\f2\b\b\u0003\u0010\u0017\u001a\u00020\f2\b\b\u0003\u0010\u0018\u001a\u00020\f2\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0003\u0010\u001f\u001a\u00020\f2\b\b\u0003\u0010 \u001a\u00020\f2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0003\u0010#\u001a\u00020\f2\b\b\u0003\u0010$\u001a\u00020\f2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010%HÆ\u0001¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u00100\u001a\u0004\b3\u00104R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00102\u0012\u0004\b8\u00100\u001a\u0004\b7\u00104R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u00102\u0012\u0004\b;\u00100\u001a\u0004\b:\u00104R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u00102\u0012\u0004\b>\u00100\u001a\u0004\b=\u00104R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u00100\u001a\u0004\bA\u0010BR \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bG\u00100\u001a\u0004\b\r\u0010FR \u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010E\u0012\u0004\bI\u00100\u001a\u0004\b\u000e\u0010FR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bN\u00100\u001a\u0004\bL\u0010MR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u00102\u0012\u0004\bQ\u00100\u001a\u0004\bP\u00104R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u00100\u001a\u0004\bT\u0010UR\"\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bW\u0010X\u0012\u0004\bZ\u00100\u001a\u0004\b\u0014\u0010YR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b[\u00102\u0012\u0004\b]\u00100\u001a\u0004\b\\\u00104R \u0010\u0016\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b^\u0010E\u0012\u0004\b`\u00100\u001a\u0004\b_\u0010FR \u0010\u0017\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\ba\u0010E\u0012\u0004\bc\u00100\u001a\u0004\bb\u0010FR \u0010\u0018\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bd\u0010E\u0012\u0004\bf\u00100\u001a\u0004\be\u0010FR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bg\u0010h\u0012\u0004\bk\u00100\u001a\u0004\bi\u0010jR\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bl\u0010m\u0012\u0004\bp\u00100\u001a\u0004\bn\u0010oR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bq\u0010r\u0012\u0004\bu\u00100\u001a\u0004\bs\u0010tR \u0010\u001f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bv\u0010E\u0012\u0004\bx\u00100\u001a\u0004\bw\u0010FR \u0010 \u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\by\u0010E\u0012\u0004\bz\u00100\u001a\u0004\b \u0010FR\"\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b{\u0010|\u0012\u0004\b\u007f\u00100\u001a\u0004\b}\u0010~R\"\u0010#\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\b\u0080\u0001\u0010E\u0012\u0005\b\u0081\u0001\u00100\u001a\u0004\b#\u0010FR\"\u0010$\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0014\n\u0005\b\u0082\u0001\u0010E\u0012\u0005\b\u0083\u0001\u00100\u001a\u0004\b$\u0010FR'\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u0012\u0005\b\u0088\u0001\u00100\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0089\u0001"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/Session;", "", "", "timestamp", "", "sessionId", "joinSessionToken", "joinSessionUrl", "sessionOwnerId", "", "Lcom/spotify/jam/internal/socialconnect/models/SessionMember;", "sessionMembers", "", "isListening", "isControlling", "Lp/p301;", "initialSessionType", "hostActiveDeviceId", "", "maxMemberCount", "isSessionOwner", "participantVolumeControlRaw", "active", "queueOnlyMode", "wifiBroadcast", "Lcom/spotify/jam/internal/socialconnect/models/SessionOrigin;", "origin", "Lcom/spotify/jam/internal/socialconnect/models/SessionConfiguration;", "configuration", "Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;", "hostDeviceInfo", "mixedTastesEnabled", "isPaused", "Lcom/spotify/jam/internal/socialconnect/models/SessionUserCapabilities;", "userCapabilities", "isJamPaused", "isJamCapped", "Lcom/spotify/jam/internal/socialconnect/models/SessionConfig;", "sessionConfig", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLp/p301;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;ZZZLcom/spotify/jam/internal/socialconnect/models/SessionOrigin;Lcom/spotify/jam/internal/socialconnect/models/SessionConfiguration;Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;ZZLcom/spotify/jam/internal/socialconnect/models/SessionUserCapabilities;ZZLcom/spotify/jam/internal/socialconnect/models/SessionConfig;)V", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLp/p301;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;ZZZLcom/spotify/jam/internal/socialconnect/models/SessionOrigin;Lcom/spotify/jam/internal/socialconnect/models/SessionConfiguration;Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;ZZLcom/spotify/jam/internal/socialconnect/models/SessionUserCapabilities;ZZLcom/spotify/jam/internal/socialconnect/models/SessionConfig;)Lcom/spotify/jam/internal/socialconnect/models/Session;", "a", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "getTimestamp$annotations", "()V", "b", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "getSessionId$annotations", "c", "getJoinSessionToken", "getJoinSessionToken$annotations", "d", "getJoinSessionUrl", "getJoinSessionUrl$annotations", "e", "getSessionOwnerId", "getSessionOwnerId$annotations", "f", "Ljava/util/List;", "getSessionMembers", "()Ljava/util/List;", "getSessionMembers$annotations", "g", "Z", "()Z", "isListening$annotations", "h", "isControlling$annotations", "i", "Lp/p301;", "getInitialSessionType", "()Lp/p301;", "getInitialSessionType$annotations", "j", "getHostActiveDeviceId", "getHostActiveDeviceId$annotations", "k", "Ljava/lang/Integer;", "getMaxMemberCount", "()Ljava/lang/Integer;", "getMaxMemberCount$annotations", "l", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isSessionOwner$annotations", "m", "getParticipantVolumeControlRaw", "getParticipantVolumeControlRaw$annotations", "n", "getActive", "getActive$annotations", "o", "getQueueOnlyMode", "getQueueOnlyMode$annotations", "p", "getWifiBroadcast", "getWifiBroadcast$annotations", "q", "Lcom/spotify/jam/internal/socialconnect/models/SessionOrigin;", "getOrigin", "()Lcom/spotify/jam/internal/socialconnect/models/SessionOrigin;", "getOrigin$annotations", "r", "Lcom/spotify/jam/internal/socialconnect/models/SessionConfiguration;", "getConfiguration", "()Lcom/spotify/jam/internal/socialconnect/models/SessionConfiguration;", "getConfiguration$annotations", "s", "Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;", "getHostDeviceInfo", "()Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;", "getHostDeviceInfo$annotations", "t", "getMixedTastesEnabled", "getMixedTastesEnabled$annotations", "u", "isPaused$annotations", "v", "Lcom/spotify/jam/internal/socialconnect/models/SessionUserCapabilities;", "getUserCapabilities", "()Lcom/spotify/jam/internal/socialconnect/models/SessionUserCapabilities;", "getUserCapabilities$annotations", "w", "isJamPaused$annotations", "x", "isJamCapped$annotations", "y", "Lcom/spotify/jam/internal/socialconnect/models/SessionConfig;", "getSessionConfig", "()Lcom/spotify/jam/internal/socialconnect/models/SessionConfig;", "getSessionConfig$annotations", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class Session {

    /* JADX INFO: renamed from: A */
    public static final Session f4850A = new Session(null, null, null, null, null, null, false, false, null, null, null, null, null, false, false, false, null, null, null, false, false, null, false, false, null, 33554431, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String sessionId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final String joinSessionToken;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String joinSessionUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String sessionOwnerId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final List sessionMembers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean isListening;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean isControlling;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final p301 initialSessionType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final String hostActiveDeviceId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final Integer maxMemberCount;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final Boolean isSessionOwner;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final String participantVolumeControlRaw;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final boolean active;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final boolean queueOnlyMode;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final boolean wifiBroadcast;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final SessionOrigin origin;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final SessionConfiguration configuration;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final SessionDeviceInfo hostDeviceInfo;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final boolean mixedTastesEnabled;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final boolean isPaused;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final SessionUserCapabilities userCapabilities;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final boolean isJamPaused;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final boolean isJamCapped;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public final SessionConfig sessionConfig;

    /* JADX INFO: renamed from: z */
    public final transient j3n0 f4876z;

    public Session(@gk60(name = "timestamp") Long l, @gk60(name = "session_id") String str, @gk60(name = "join_session_token") String str2, @gk60(name = "join_session_url") String str3, @gk60(name = "session_owner_id") String str4, @gk60(name = "session_members") List<SessionMember> list, @gk60(name = "is_listening") boolean z, @gk60(name = "is_controlling") boolean z2, @gk60(name = "initialSessionType") p301 p301Var, @gk60(name = "hostActiveDeviceId") String str5, @gk60(name = "maxMemberCount") Integer num, @gk60(name = "is_session_owner") Boolean bool, @gk60(name = "participantVolumeControl") String str6, @gk60(name = "active") boolean z3, @gk60(name = "queue_only_mode") boolean z4, @gk60(name = "wifi_broadcast") boolean z5, @gk60(name = "origin") SessionOrigin sessionOrigin, @gk60(name = "configuration") SessionConfiguration sessionConfiguration, @gk60(name = "host_device_info") SessionDeviceInfo sessionDeviceInfo, @gk60(name = "quick_blend") boolean z6, @gk60(name = "is_paused") boolean z7, @gk60(name = "user_capabilities") SessionUserCapabilities sessionUserCapabilities, @gk60(name = "is_jam_paused") boolean z8, @gk60(name = "is_jam_capped") boolean z9, @gk60(name = "session_config") SessionConfig sessionConfig) {
        this.timestamp = l;
        this.sessionId = str;
        this.joinSessionToken = str2;
        this.joinSessionUrl = str3;
        this.sessionOwnerId = str4;
        this.sessionMembers = list;
        this.isListening = z;
        this.isControlling = z2;
        this.initialSessionType = p301Var;
        this.hostActiveDeviceId = str5;
        this.maxMemberCount = num;
        this.isSessionOwner = bool;
        this.participantVolumeControlRaw = str6;
        this.active = z3;
        this.queueOnlyMode = z4;
        this.wifiBroadcast = z5;
        this.origin = sessionOrigin;
        this.configuration = sessionConfiguration;
        this.hostDeviceInfo = sessionDeviceInfo;
        this.mixedTastesEnabled = z6;
        this.isPaused = z7;
        this.userCapabilities = sessionUserCapabilities;
        this.isJamPaused = z8;
        this.isJamCapped = z9;
        this.sessionConfig = sessionConfig;
        this.f4876z = qkg1.m73115l(str6, j3n0.UNAVAILABLE);
    }

    @gk60(name = "active")
    public static /* synthetic */ void getActive$annotations() {
    }

    @gk60(name = "configuration")
    public static /* synthetic */ void getConfiguration$annotations() {
    }

    @gk60(name = "hostActiveDeviceId")
    public static /* synthetic */ void getHostActiveDeviceId$annotations() {
    }

    @gk60(name = "host_device_info")
    public static /* synthetic */ void getHostDeviceInfo$annotations() {
    }

    @gk60(name = "initialSessionType")
    public static /* synthetic */ void getInitialSessionType$annotations() {
    }

    @gk60(name = "join_session_token")
    public static /* synthetic */ void getJoinSessionToken$annotations() {
    }

    @gk60(name = "join_session_url")
    public static /* synthetic */ void getJoinSessionUrl$annotations() {
    }

    @gk60(name = "maxMemberCount")
    public static /* synthetic */ void getMaxMemberCount$annotations() {
    }

    @gk60(name = "quick_blend")
    public static /* synthetic */ void getMixedTastesEnabled$annotations() {
    }

    @gk60(name = "origin")
    public static /* synthetic */ void getOrigin$annotations() {
    }

    @gk60(name = "participantVolumeControl")
    public static /* synthetic */ void getParticipantVolumeControlRaw$annotations() {
    }

    @gk60(name = "queue_only_mode")
    public static /* synthetic */ void getQueueOnlyMode$annotations() {
    }

    @gk60(name = "session_config")
    public static /* synthetic */ void getSessionConfig$annotations() {
    }

    @gk60(name = "session_id")
    public static /* synthetic */ void getSessionId$annotations() {
    }

    @gk60(name = "session_members")
    public static /* synthetic */ void getSessionMembers$annotations() {
    }

    @gk60(name = "session_owner_id")
    public static /* synthetic */ void getSessionOwnerId$annotations() {
    }

    @gk60(name = "timestamp")
    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @gk60(name = "user_capabilities")
    public static /* synthetic */ void getUserCapabilities$annotations() {
    }

    @gk60(name = "wifi_broadcast")
    public static /* synthetic */ void getWifiBroadcast$annotations() {
    }

    @gk60(name = "is_controlling")
    public static /* synthetic */ void isControlling$annotations() {
    }

    @gk60(name = "is_jam_capped")
    public static /* synthetic */ void isJamCapped$annotations() {
    }

    @gk60(name = "is_jam_paused")
    public static /* synthetic */ void isJamPaused$annotations() {
    }

    @gk60(name = "is_listening")
    public static /* synthetic */ void isListening$annotations() {
    }

    @gk60(name = "is_paused")
    public static /* synthetic */ void isPaused$annotations() {
    }

    @gk60(name = "is_session_owner")
    public static /* synthetic */ void isSessionOwner$annotations() {
    }

    public final Session copy(@gk60(name = "timestamp") Long timestamp, @gk60(name = "session_id") String sessionId, @gk60(name = "join_session_token") String joinSessionToken, @gk60(name = "join_session_url") String joinSessionUrl, @gk60(name = "session_owner_id") String sessionOwnerId, @gk60(name = "session_members") List<SessionMember> sessionMembers, @gk60(name = "is_listening") boolean isListening, @gk60(name = "is_controlling") boolean isControlling, @gk60(name = "initialSessionType") p301 initialSessionType, @gk60(name = "hostActiveDeviceId") String hostActiveDeviceId, @gk60(name = "maxMemberCount") Integer maxMemberCount, @gk60(name = "is_session_owner") Boolean isSessionOwner, @gk60(name = "participantVolumeControl") String participantVolumeControlRaw, @gk60(name = "active") boolean active, @gk60(name = "queue_only_mode") boolean queueOnlyMode, @gk60(name = "wifi_broadcast") boolean wifiBroadcast, @gk60(name = "origin") SessionOrigin origin, @gk60(name = "configuration") SessionConfiguration configuration, @gk60(name = "host_device_info") SessionDeviceInfo hostDeviceInfo, @gk60(name = "quick_blend") boolean mixedTastesEnabled, @gk60(name = "is_paused") boolean isPaused, @gk60(name = "user_capabilities") SessionUserCapabilities userCapabilities, @gk60(name = "is_jam_paused") boolean isJamPaused, @gk60(name = "is_jam_capped") boolean isJamCapped, @gk60(name = "session_config") SessionConfig sessionConfig) {
        return new Session(timestamp, sessionId, joinSessionToken, joinSessionUrl, sessionOwnerId, sessionMembers, isListening, isControlling, initialSessionType, hostActiveDeviceId, maxMemberCount, isSessionOwner, participantVolumeControlRaw, active, queueOnlyMode, wifiBroadcast, origin, configuration, hostDeviceInfo, mixedTastesEnabled, isPaused, userCapabilities, isJamPaused, isJamCapped, sessionConfig);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return wj50.m88271j(this.timestamp, session.timestamp) && wj50.m88271j(this.sessionId, session.sessionId) && wj50.m88271j(this.joinSessionToken, session.joinSessionToken) && wj50.m88271j(this.joinSessionUrl, session.joinSessionUrl) && wj50.m88271j(this.sessionOwnerId, session.sessionOwnerId) && wj50.m88271j(this.sessionMembers, session.sessionMembers) && this.isListening == session.isListening && this.isControlling == session.isControlling && this.initialSessionType == session.initialSessionType && wj50.m88271j(this.hostActiveDeviceId, session.hostActiveDeviceId) && wj50.m88271j(this.maxMemberCount, session.maxMemberCount) && wj50.m88271j(this.isSessionOwner, session.isSessionOwner) && wj50.m88271j(this.participantVolumeControlRaw, session.participantVolumeControlRaw) && this.active == session.active && this.queueOnlyMode == session.queueOnlyMode && this.wifiBroadcast == session.wifiBroadcast && wj50.m88271j(this.origin, session.origin) && wj50.m88271j(this.configuration, session.configuration) && wj50.m88271j(this.hostDeviceInfo, session.hostDeviceInfo) && this.mixedTastesEnabled == session.mixedTastesEnabled && this.isPaused == session.isPaused && wj50.m88271j(this.userCapabilities, session.userCapabilities) && this.isJamPaused == session.isJamPaused && this.isJamCapped == session.isJamCapped && wj50.m88271j(this.sessionConfig, session.sessionConfig);
    }

    public final int hashCode() {
        Long l = this.timestamp;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.sessionId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.joinSessionToken;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.joinSessionUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sessionOwnerId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.sessionMembers;
        int iM77245d = s571.m77245d(s571.m77245d((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isListening), 31, this.isControlling);
        p301 p301Var = this.initialSessionType;
        int iHashCode6 = (iM77245d + (p301Var == null ? 0 : p301Var.hashCode())) * 31;
        String str5 = this.hostActiveDeviceId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.maxMemberCount;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isSessionOwner;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.participantVolumeControlRaw;
        int iM77245d2 = s571.m77245d(s571.m77245d(s571.m77245d((iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.active), 31, this.queueOnlyMode), 31, this.wifiBroadcast);
        SessionOrigin sessionOrigin = this.origin;
        int iHashCode10 = (iM77245d2 + (sessionOrigin == null ? 0 : sessionOrigin.hashCode())) * 31;
        SessionConfiguration sessionConfiguration = this.configuration;
        int iHashCode11 = (iHashCode10 + (sessionConfiguration == null ? 0 : sessionConfiguration.hashCode())) * 31;
        SessionDeviceInfo sessionDeviceInfo = this.hostDeviceInfo;
        int iM77245d3 = s571.m77245d(s571.m77245d((iHashCode11 + (sessionDeviceInfo == null ? 0 : sessionDeviceInfo.hashCode())) * 31, 31, this.mixedTastesEnabled), 31, this.isPaused);
        SessionUserCapabilities sessionUserCapabilities = this.userCapabilities;
        int iM77245d4 = s571.m77245d(s571.m77245d((iM77245d3 + (sessionUserCapabilities == null ? 0 : sessionUserCapabilities.hashCode())) * 31, 31, this.isJamPaused), 31, this.isJamCapped);
        SessionConfig sessionConfig = this.sessionConfig;
        return iM77245d4 + (sessionConfig != null ? sessionConfig.hashCode() : 0);
    }

    public /* synthetic */ Session(Long l, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, p301 p301Var, String str5, Integer num, Boolean bool, String str6, boolean z3, boolean z4, boolean z5, SessionOrigin sessionOrigin, SessionConfiguration sessionConfiguration, SessionDeviceInfo sessionDeviceInfo, boolean z6, boolean z7, SessionUserCapabilities sessionUserCapabilities, boolean z8, boolean z9, SessionConfig sessionConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : p301Var, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? Boolean.FALSE : bool, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? false : z3, (i & 16384) != 0 ? false : z4, (i & 32768) != 0 ? false : z5, (i & 65536) != 0 ? null : sessionOrigin, (i & 131072) != 0 ? null : sessionConfiguration, (i & 262144) != 0 ? null : sessionDeviceInfo, (i & 524288) != 0 ? false : z6, (i & 1048576) != 0 ? false : z7, (i & 2097152) != 0 ? null : sessionUserCapabilities, (i & 4194304) != 0 ? false : z8, (i & 8388608) != 0 ? false : z9, (i & 16777216) != 0 ? null : sessionConfig);
    }
}
