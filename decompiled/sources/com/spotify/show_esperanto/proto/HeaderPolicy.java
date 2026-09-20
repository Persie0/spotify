package com.spotify.show_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.ShowCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowOfflineStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowPlayedStateDecorationPolicy;
import p204p.nl20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class HeaderPolicy extends AbstractC0269h implements sre0 {
    private static final HeaderPolicy DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_COLLECTION_POLICY_FIELD_NUMBER = 3;
    public static final int SHOW_OFFLINE_STATE_POLICY_FIELD_NUMBER = 4;
    public static final int SHOW_PLAYED_STATE_POLICY_FIELD_NUMBER = 2;
    public static final int SHOW_POLICY_FIELD_NUMBER = 1;
    private int bitField0_;
    private ShowCollectionDecorationPolicy showCollectionPolicy_;
    private ShowOfflineStateDecorationPolicy showOfflineStatePolicy_;
    private ShowPlayedStateDecorationPolicy showPlayedStatePolicy_;
    private ShowDecorationPolicy showPolicy_;

    static {
        HeaderPolicy headerPolicy = new HeaderPolicy();
        DEFAULT_INSTANCE = headerPolicy;
        AbstractC0269h.registerDefaultInstance(HeaderPolicy.class, headerPolicy);
    }

    private HeaderPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21220n(HeaderPolicy headerPolicy, ShowCollectionDecorationPolicy showCollectionDecorationPolicy) {
        headerPolicy.getClass();
        showCollectionDecorationPolicy.getClass();
        headerPolicy.showCollectionPolicy_ = showCollectionDecorationPolicy;
        headerPolicy.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m21221o(HeaderPolicy headerPolicy, ShowOfflineStateDecorationPolicy showOfflineStateDecorationPolicy) {
        headerPolicy.getClass();
        showOfflineStateDecorationPolicy.getClass();
        headerPolicy.showOfflineStatePolicy_ = showOfflineStateDecorationPolicy;
        headerPolicy.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: p */
    public static void m21222p(HeaderPolicy headerPolicy, ShowPlayedStateDecorationPolicy showPlayedStateDecorationPolicy) {
        headerPolicy.getClass();
        showPlayedStateDecorationPolicy.getClass();
        headerPolicy.showPlayedStatePolicy_ = showPlayedStateDecorationPolicy;
        headerPolicy.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21223q(HeaderPolicy headerPolicy, ShowDecorationPolicy showDecorationPolicy) {
        headerPolicy.getClass();
        showDecorationPolicy.getClass();
        headerPolicy.showPolicy_ = showDecorationPolicy;
        headerPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static nl20 m21224r() {
        return (nl20) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "showPolicy_", "showPlayedStatePolicy_", "showCollectionPolicy_", "showOfflineStatePolicy_"});
        }
        if (iOrdinal == 3) {
            return new HeaderPolicy();
        }
        if (iOrdinal == 4) {
            return new nl20(DEFAULT_INSTANCE);
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
        synchronized (HeaderPolicy.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
