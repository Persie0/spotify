package com.spotify.jam.internal.socialconnect.models;

import java.util.Locale;
import kotlin.Metadata;
import p204p.C2042k7;
import p204p.gk60;
import p204p.ok60;
import p204p.s0x0;
import p204p.wj50;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u0012\u0004\b\u000f\u0010\r\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/ResolvedToken;", "", "", "rawDiscoveryMethod", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/jam/internal/socialconnect/models/ResolvedToken;", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "getRawDiscoveryMethod$annotations", "()V", "b", "getToken$annotations", "p/s0x0", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
@ok60(generateAdapter = true)
public final /* data */ class ResolvedToken {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String rawDiscoveryMethod;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String token;

    /* JADX INFO: renamed from: c */
    public final s0x0 f4847c;

    public ResolvedToken(@gk60(name = "discovery_method") String str, @gk60(name = "token") String str2) {
        Object next;
        String strName;
        Locale locale;
        this.rawDiscoveryMethod = str;
        this.token = str2;
        C2042k7 c2042k7 = new C2042k7(s0x0.f204552c, 0);
        do {
            if (!c2042k7.hasNext()) {
                next = null;
                break;
            } else {
                next = c2042k7.next();
                strName = ((s0x0) next).name();
                locale = Locale.ROOT;
            }
        } while (!strName.toLowerCase(locale).equals(str.toLowerCase(locale)));
        s0x0 s0x0Var = (s0x0) next;
        this.f4847c = s0x0Var == null ? s0x0.f204550a : s0x0Var;
    }

    @gk60(name = "discovery_method")
    public static /* synthetic */ void getRawDiscoveryMethod$annotations() {
    }

    @gk60(name = "token")
    public static /* synthetic */ void getToken$annotations() {
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRawDiscoveryMethod() {
        return this.rawDiscoveryMethod;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final ResolvedToken copy(@gk60(name = "discovery_method") String rawDiscoveryMethod, @gk60(name = "token") String token) {
        return new ResolvedToken(rawDiscoveryMethod, token);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedToken)) {
            return false;
        }
        ResolvedToken resolvedToken = (ResolvedToken) obj;
        return wj50.m88271j(this.rawDiscoveryMethod, resolvedToken.rawDiscoveryMethod) && wj50.m88271j(this.token, resolvedToken.token);
    }

    public final int hashCode() {
        return this.token.hashCode() + (this.rawDiscoveryMethod.hashCode() * 31);
    }
}
