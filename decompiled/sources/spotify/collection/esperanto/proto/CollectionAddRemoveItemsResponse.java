package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import spotify.collection_cosmos.proto.StatusOuterClass$Status;

/* JADX INFO: loaded from: classes11.dex */
public final class CollectionAddRemoveItemsResponse extends AbstractC0269h implements sre0 {
    private static final CollectionAddRemoveItemsResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private StatusOuterClass$Status status_;

    static {
        CollectionAddRemoveItemsResponse collectionAddRemoveItemsResponse = new CollectionAddRemoveItemsResponse();
        DEFAULT_INSTANCE = collectionAddRemoveItemsResponse;
        AbstractC0269h.registerDefaultInstance(CollectionAddRemoveItemsResponse.class, collectionAddRemoveItemsResponse);
    }

    private CollectionAddRemoveItemsResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static CollectionAddRemoveItemsResponse m97437o(byte[] bArr) {
        return (CollectionAddRemoveItemsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "status_"});
        }
        if (iOrdinal == 3) {
            return new CollectionAddRemoveItemsResponse();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 27);
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
        synchronized (CollectionAddRemoveItemsResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final StatusOuterClass$Status m97438n() {
        StatusOuterClass$Status statusOuterClass$Status = this.status_;
        return statusOuterClass$Status == null ? StatusOuterClass$Status.m97549p() : statusOuterClass$Status;
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
