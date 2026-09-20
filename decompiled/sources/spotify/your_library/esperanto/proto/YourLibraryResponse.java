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
public final class YourLibraryResponse extends AbstractC0269h implements sre0 {
    private static final YourLibraryResponse DEFAULT_INSTANCE;
    public static final int ENTITY_FIELD_NUMBER = 2;
    public static final int ERROR_FIELD_NUMBER = 99;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PINNED_ENTITY_FIELD_NUMBER = 3;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    private int bitField0_;
    private YourLibraryResponseHeader header_;
    private int statusCode_;
    private ae50 entity_ = AbstractC0269h.emptyProtobufList();
    private ae50 pinnedEntity_ = AbstractC0269h.emptyProtobufList();
    private String error_ = "";

    static {
        YourLibraryResponse yourLibraryResponse = new YourLibraryResponse();
        DEFAULT_INSTANCE = yourLibraryResponse;
        AbstractC0269h.registerDefaultInstance(YourLibraryResponse.class, yourLibraryResponse);
    }

    private YourLibraryResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static YourLibraryResponse m98194s(byte[] bArr) {
        return (YourLibraryResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: renamed from: b */
    public final int m98195b() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001c\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001bb\u0004cȈ", new Object[]{"bitField0_", "header_", "entity_", YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.class, "pinnedEntity_", YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.class, "statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new YourLibraryResponse();
        }
        if (iOrdinal == 4) {
            return new ebe1(DEFAULT_INSTANCE, 27);
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
        synchronized (YourLibraryResponse.class) {
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

    public final int getStatusCode() {
        return this.statusCode_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m98196n() {
        return this.entity_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m98197o() {
        return this.entity_;
    }

    /* JADX INFO: renamed from: p */
    public final String m98198p() {
        return this.error_;
    }

    /* JADX INFO: renamed from: q */
    public final YourLibraryResponseHeader m98199q() {
        YourLibraryResponseHeader yourLibraryResponseHeader = this.header_;
        return yourLibraryResponseHeader == null ? YourLibraryResponseHeader.m98201o() : yourLibraryResponseHeader;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m98200r() {
        return this.pinnedEntity_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
