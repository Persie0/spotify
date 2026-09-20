package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.e8a;
import p204p.ioc;
import p204p.ld50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import spotify.collection_cosmos.proto.StatusOuterClass$Status;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionContainsResponse extends AbstractC0269h implements sre0 {
    public static final int BAN_FOUND_FIELD_NUMBER = 3;
    private static final CollectionContainsResponse DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private StatusOuterClass$Status status_;
    private int foundMemoizedSerializedSize = -1;
    private int banFoundMemoizedSerializedSize = -1;
    private ld50 found_ = AbstractC0269h.emptyBooleanList();
    private ld50 banFound_ = AbstractC0269h.emptyBooleanList();

    static {
        CollectionContainsResponse collectionContainsResponse = new CollectionContainsResponse();
        DEFAULT_INSTANCE = collectionContainsResponse;
        AbstractC0269h.registerDefaultInstance(CollectionContainsResponse.class, collectionContainsResponse);
    }

    private CollectionContainsResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static CollectionContainsResponse m97465r(byte[] bArr) {
        return (CollectionContainsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002*\u0003*", new Object[]{"bitField0_", "status_", "found_", "banFound_"});
        }
        if (iOrdinal == 3) {
            return new CollectionContainsResponse();
        }
        if (iOrdinal == 4) {
            return new ioc(28);
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
        synchronized (CollectionContainsResponse.class) {
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

    /* JADX INFO: renamed from: o */
    public final int m97466o() {
        return ((e8a) this.banFound_).size();
    }

    /* JADX INFO: renamed from: p */
    public final ld50 m97467p() {
        return this.banFound_;
    }

    /* JADX INFO: renamed from: q */
    public final ld50 m97468q() {
        return this.found_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
