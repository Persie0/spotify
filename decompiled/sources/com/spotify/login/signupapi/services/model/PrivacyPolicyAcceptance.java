package com.spotify.login.signupapi.services.model;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.c95;
import p204p.lzv;
import p204p.nzv;
import p204p.rr60;
import p204p.rtz0;

/* JADX INFO: loaded from: classes8.dex */
@rtz0(with = PrivacyPolicyAcceptanceSerializer.class)
@Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m24212d2 = {"Lcom/spotify/login/signupapi/services/model/PrivacyPolicyAcceptance;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IMPLICIT", "EXPLICIT", "NON", "Companion", "src_main_java_com_spotify_login_signupapi-signupapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public enum PrivacyPolicyAcceptance {
    IMPLICIT("implicit"),
    EXPLICIT("explicit"),
    NON("non");

    private final String value;
    private static final /* synthetic */ lzv $ENTRIES = new nzv(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m24212d2 = {"Lcom/spotify/login/signupapi/services/model/PrivacyPolicyAcceptance$Companion;", "", "<init>", "()V", "", "code", "Lcom/spotify/login/signupapi/services/model/PrivacyPolicyAcceptance;", "fromString", "(Ljava/lang/String;)Lcom/spotify/login/signupapi/services/model/PrivacyPolicyAcceptance;", "Lp/rr60;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_login_signupapi-signupapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PrivacyPolicyAcceptance fromString(String code) {
            PrivacyPolicyAcceptance[] privacyPolicyAcceptanceArrValues = PrivacyPolicyAcceptance.values();
            int iM31820L = c95.m31820L(privacyPolicyAcceptanceArrValues.length);
            if (iM31820L < 16) {
                iM31820L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
            for (PrivacyPolicyAcceptance privacyPolicyAcceptance : privacyPolicyAcceptanceArrValues) {
                linkedHashMap.put(privacyPolicyAcceptance.getValue(), privacyPolicyAcceptance);
            }
            PrivacyPolicyAcceptance privacyPolicyAcceptance2 = (PrivacyPolicyAcceptance) linkedHashMap.get(code);
            return privacyPolicyAcceptance2 == null ? PrivacyPolicyAcceptance.EXPLICIT : privacyPolicyAcceptance2;
        }

        public final rr60 serializer() {
            return PrivacyPolicyAcceptanceSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    PrivacyPolicyAcceptance(String str) {
        this.value = str;
    }

    public static lzv getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
