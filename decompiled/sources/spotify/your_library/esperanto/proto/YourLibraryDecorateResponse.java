package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ebe1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibraryDecorateResponse extends AbstractC0269h implements sre0 {
    private static final YourLibraryDecorateResponse DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 2;
    public static final int ERROR_FIELD_NUMBER = 99;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    private int bitField0_;
    private ae50 entity_ = AbstractC0269h.emptyProtobufList();
    private String error_ = "";
    private YourLibraryDecorateResponseHeader header_;
    private int statusCode_;

    static {
        YourLibraryDecorateResponse yourLibraryDecorateResponse = new YourLibraryDecorateResponse();
        DEFAULT_INSTANCE = yourLibraryDecorateResponse;
        AbstractC0269h.registerDefaultInstance(YourLibraryDecorateResponse.class, yourLibraryDecorateResponse);
    }

    private YourLibraryDecorateResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static YourLibraryDecorateResponse m98163q(byte[] bArr) {
        return (YourLibraryDecorateResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: renamed from: b */
    public final int m98164b() {
        return this.entity_.size();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001c\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001bb\u000bcȈ", new Object[]{"bitField0_", "header_", "entity_", YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.class, "statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryDecorateResponse();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 9);
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
        synchronized (YourLibraryDecorateResponse.class) {
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
    public final YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity m98165n() {
        return (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity) this.entity_.get(0);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m98166o() {
        return this.entity_;
    }

    /* JADX INFO: renamed from: p */
    public final YourLibraryDecorateResponseHeader m98167p() {
        YourLibraryDecorateResponseHeader yourLibraryDecorateResponseHeader = this.header_;
        return yourLibraryDecorateResponseHeader == null ? YourLibraryDecorateResponseHeader.m98168n() : yourLibraryDecorateResponseHeader;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
