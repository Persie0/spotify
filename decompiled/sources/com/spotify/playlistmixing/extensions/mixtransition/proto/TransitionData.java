package com.spotify.playlistmixing.extensions.mixtransition.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s791;
import p204p.sre0;
import p204p.t791;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class TransitionData extends AbstractC0269h implements sre0 {
    public static final int CREATOR_USER_ID_FIELD_NUMBER = 5;
    private static final TransitionData DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 4;
    public static final int LATEST_TRANSITION_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYLIST_URI_FIELD_NUMBER = 3;
    public static final int TRACK_A_URI_FIELD_NUMBER = 7;
    public static final int TRACK_B_URI_FIELD_NUMBER = 8;
    public static final int TRANSITION_FIELD_NUMBER = 6;
    public static final int TRANSITION_URI_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 9;
    private int type_;
    private String transitionUri_ = "";
    private String latestTransitionUri_ = "";
    private String playlistUri_ = "";
    private gva itemId_ = gva.f84678b;
    private String creatorUserId_ = "";
    private String transition_ = "";
    private String trackAUri_ = "";
    private String trackBUri_ = "";

    static {
        TransitionData transitionData = new TransitionData();
        DEFAULT_INSTANCE = transitionData;
        AbstractC0269h.registerDefaultInstance(TransitionData.class, transitionData);
    }

    private TransitionData() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static TransitionData m19362s(byte[] bArr) {
        return (TransitionData) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\n\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\t\f", new Object[]{"transitionUri_", "latestTransitionUri_", "playlistUri_", "itemId_", "creatorUserId_", "transition_", "trackAUri_", "trackBUri_", "type_"});
        }
        if (iOrdinal == 3) {
            return new TransitionData();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 0);
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
        synchronized (TransitionData.class) {
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

    public final gva getItemId() {
        return this.itemId_;
    }

    public final String getPlaylistUri() {
        return this.playlistUri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m19363n() {
        return this.creatorUserId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m19364o() {
        return this.latestTransitionUri_;
    }

    /* JADX INFO: renamed from: p */
    public final String m19365p() {
        return this.transition_;
    }

    /* JADX INFO: renamed from: q */
    public final String m19366q() {
        return this.transitionUri_;
    }

    /* JADX INFO: renamed from: r */
    public final t791 m19367r() {
        t791 t791Var;
        int i = this.type_;
        if (i == 0) {
            t791Var = t791.TRANSITION_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            t791Var = i != 2 ? null : t791.TRANSITION_TYPE_CUSTOM;
        } else {
            t791Var = t791.TRANSITION_TYPE_AUTO;
        }
        return t791Var == null ? t791.UNRECOGNIZED : t791Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
