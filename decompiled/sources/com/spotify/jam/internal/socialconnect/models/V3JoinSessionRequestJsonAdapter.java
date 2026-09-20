package com.spotify.jam.internal.socialconnect.models;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import org.msgpack.core.MessagePack;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/V3JoinSessionRequestJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/V3JoinSessionRequest;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class V3JoinSessionRequestJsonAdapter extends hk60<V3JoinSessionRequest> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4959a = xl60.C2578b.m91389a("join_token", "join_type", "playback_control", "local_device_id", "join_attempt_id", "permission_mode");

    /* JADX INFO: renamed from: b */
    public final hk60 f4960b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4961c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f4962d;

    public V3JoinSessionRequestJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4960b = p0i0Var.m68706f(String.class, gbuVar, "joinToken");
        this.f4961c = p0i0Var.m68706f(String.class, gbuVar, "permissionMode");
    }

    @Override // p204p.hk60
    public final V3JoinSessionRequest fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        byte b = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            String str7 = str;
            String str8 = str2;
            String str9 = str3;
            if (!xl60Var.mo51079i()) {
                String str10 = str4;
                xl60Var.mo51078f();
                if (b == -33) {
                    if (str7 == null) {
                        throw f0b1.m40461o("joinToken", "join_token", xl60Var);
                    }
                    if (str8 == null) {
                        throw f0b1.m40461o("joinType", "join_type", xl60Var);
                    }
                    if (str9 == null) {
                        throw f0b1.m40461o("playbackControl", "playback_control", xl60Var);
                    }
                    if (str10 == null) {
                        throw f0b1.m40461o("localDeviceId", "local_device_id", xl60Var);
                    }
                    if (str5 == null) {
                        throw f0b1.m40461o("joinAttemptId", "join_attempt_id", xl60Var);
                    }
                    return new V3JoinSessionRequest(str7, str8, str9, str10, str5, str6);
                }
                Constructor declaredConstructor = this.f4962d;
                if (declaredConstructor == null) {
                    declaredConstructor = V3JoinSessionRequest.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, f0b1.f64588c);
                    this.f4962d = declaredConstructor;
                }
                Constructor constructor = declaredConstructor;
                if (str7 == null) {
                    throw f0b1.m40461o("joinToken", "join_token", xl60Var);
                }
                if (str8 == null) {
                    throw f0b1.m40461o("joinType", "join_type", xl60Var);
                }
                if (str9 == null) {
                    throw f0b1.m40461o("playbackControl", "playback_control", xl60Var);
                }
                if (str10 == null) {
                    throw f0b1.m40461o("localDeviceId", "local_device_id", xl60Var);
                }
                if (str5 != null) {
                    return (V3JoinSessionRequest) constructor.newInstance(str7, str8, str9, str10, str5, str6, Integer.valueOf(b), null);
                }
                throw f0b1.m40461o("joinAttemptId", "join_attempt_id", xl60Var);
            }
            String str11 = str4;
            switch (xl60Var.mo51071K(this.f4959a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    str4 = str11;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    break;
                case 0:
                    str = (String) this.f4960b.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("joinToken", "join_token", xl60Var);
                    }
                    str4 = str11;
                    str2 = str8;
                    str3 = str9;
                    break;
                    break;
                case 1:
                    str2 = (String) this.f4960b.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("joinType", "join_type", xl60Var);
                    }
                    str4 = str11;
                    str = str7;
                    str3 = str9;
                    break;
                    break;
                case 2:
                    str3 = (String) this.f4960b.fromJson(xl60Var);
                    if (str3 == null) {
                        throw f0b1.m40470x("playbackControl", "playback_control", xl60Var);
                    }
                    str4 = str11;
                    str = str7;
                    str2 = str8;
                    break;
                    break;
                case 3:
                    str4 = (String) this.f4960b.fromJson(xl60Var);
                    if (str4 == null) {
                        throw f0b1.m40470x("localDeviceId", "local_device_id", xl60Var);
                    }
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    break;
                case 4:
                    str5 = (String) this.f4960b.fromJson(xl60Var);
                    if (str5 == null) {
                        throw f0b1.m40470x("joinAttemptId", "join_attempt_id", xl60Var);
                    }
                    str4 = str11;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    break;
                case 5:
                    str6 = (String) this.f4961c.fromJson(xl60Var);
                    str4 = str11;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    b = MessagePack.Code.MAP32;
                    break;
                default:
                    str4 = str11;
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    break;
            }
        }
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, V3JoinSessionRequest v3JoinSessionRequest) {
        V3JoinSessionRequest v3JoinSessionRequest2 = v3JoinSessionRequest;
        if (v3JoinSessionRequest2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("join_token");
        String str = v3JoinSessionRequest2.joinToken;
        hk60 hk60Var = this.f4960b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("join_type");
        hk60Var.toJson(rm60Var, v3JoinSessionRequest2.joinType);
        rm60Var.mo56894s("playback_control");
        hk60Var.toJson(rm60Var, v3JoinSessionRequest2.playbackControl);
        rm60Var.mo56894s("local_device_id");
        hk60Var.toJson(rm60Var, v3JoinSessionRequest2.localDeviceId);
        rm60Var.mo56894s("join_attempt_id");
        hk60Var.toJson(rm60Var, v3JoinSessionRequest2.joinAttemptId);
        rm60Var.mo56894s("permission_mode");
        this.f4961c.toJson(rm60Var, v3JoinSessionRequest2.permissionMode);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(42, "GeneratedJsonAdapter(V3JoinSessionRequest)");
    }
}
