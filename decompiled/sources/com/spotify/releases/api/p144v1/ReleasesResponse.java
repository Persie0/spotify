package com.spotify.releases.api.p144v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.i8w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ReleasesResponse extends AbstractC0269h implements sre0 {
    private static final ReleasesResponse DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 3;
    public static final int ITEM_GROUPS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private ae50 filters_ = AbstractC0269h.emptyProtobufList();
    private ae50 itemGroups_ = AbstractC0269h.emptyProtobufList();
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    static {
        ReleasesResponse releasesResponse = new ReleasesResponse();
        DEFAULT_INSTANCE = releasesResponse;
        AbstractC0269h.registerDefaultInstance(ReleasesResponse.class, releasesResponse);
    }

    private ReleasesResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"filters_", Filter.class, "itemGroups_", ItemGroup.class, "items_", Item.class});
        }
        if (iOrdinal == 3) {
            return new ReleasesResponse();
        }
        if (iOrdinal == 4) {
            return new i8w0(DEFAULT_INSTANCE, 0);
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
        synchronized (ReleasesResponse.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m20391n() {
        return this.filters_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m20392o() {
        return this.itemGroups_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
