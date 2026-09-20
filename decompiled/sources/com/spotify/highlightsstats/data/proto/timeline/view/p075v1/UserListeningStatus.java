package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vsa1;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class UserListeningStatus extends AbstractC0269h implements sre0 {
    public static final int CASE_FIELD_NUMBER = 4;
    private static final UserListeningStatus DEFAULT_INSTANCE;
    public static final int IMAGEURI_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int case_;
    private String imageUri_ = "";
    private String title_ = "";
    private String subtitle_ = "";

    static {
        UserListeningStatus userListeningStatus = new UserListeningStatus();
        DEFAULT_INSTANCE = userListeningStatus;
        AbstractC0269h.registerDefaultInstance(UserListeningStatus.class, userListeningStatus);
    }

    private UserListeningStatus() {
    }

    /* JADX INFO: renamed from: o */
    public static UserListeningStatus m11479o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static UserListeningStatus m11480q(byte[] bArr) {
        return (UserListeningStatus) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f", new Object[]{"imageUri_", "title_", "subtitle_", "case_"});
        }
        if (iOrdinal == 3) {
            return new UserListeningStatus();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 10);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (UserListeningStatus.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final vsa1 m11481n() {
        vsa1 vsa1Var;
        int i = this.case_;
        if (i != 0) {
            vsa1Var = i != 1 ? null : vsa1.NO_LISTENING_HISTORY;
        } else {
            vsa1Var = vsa1.UNSPECIFIED;
        }
        return vsa1Var == null ? vsa1.UNRECOGNIZED : vsa1Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m11482p() {
        return this.imageUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
