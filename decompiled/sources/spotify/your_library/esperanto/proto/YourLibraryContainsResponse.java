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

/* JADX INFO: loaded from: classes3.dex */
public final class YourLibraryContainsResponse extends AbstractC0269h implements sre0 {
    private static final YourLibraryContainsResponse DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 2;
    public static final int ERROR_FIELD_NUMBER = 99;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    private int bitField0_;
    private ae50 entity_ = AbstractC0269h.emptyProtobufList();
    private String error_ = "";
    private YourLibraryContainsResponseHeader header_;
    private int statusCode_;

    static {
        YourLibraryContainsResponse yourLibraryContainsResponse = new YourLibraryContainsResponse();
        DEFAULT_INSTANCE = yourLibraryContainsResponse;
        AbstractC0269h.registerDefaultInstance(YourLibraryContainsResponse.class, yourLibraryContainsResponse);
    }

    private YourLibraryContainsResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static YourLibraryContainsResponse m98152q(byte[] bArr) {
        return (YourLibraryContainsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001c\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001bb\u000bcȈ", new Object[]{"bitField0_", "header_", "entity_", YourLibraryContainsResponseEntity.class, "statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryContainsResponse();
        }
        if (iOrdinal == 4) {
            return new ebe1(6);
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
        synchronized (YourLibraryContainsResponse.class) {
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
    public final ae50 m98153o() {
        return this.entity_;
    }

    /* JADX INFO: renamed from: p */
    public final String m98154p() {
        return this.error_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
