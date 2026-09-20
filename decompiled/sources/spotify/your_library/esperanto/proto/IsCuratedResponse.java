package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes3.dex */
public final class IsCuratedResponse extends AbstractC0269h implements sre0 {
    private static final IsCuratedResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 99;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_CODE_FIELD_NUMBER = 98;
    private int statusCode_;
    private ae50 item_ = AbstractC0269h.emptyProtobufList();
    private String error_ = "";

    static {
        IsCuratedResponse isCuratedResponse = new IsCuratedResponse();
        DEFAULT_INSTANCE = isCuratedResponse;
        AbstractC0269h.registerDefaultInstance(IsCuratedResponse.class, isCuratedResponse);
    }

    private IsCuratedResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static IsCuratedResponse m98127o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static IsCuratedResponse m98128r(byte[] bArr) {
        return (IsCuratedResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001c\u0003\u0000\u0001\u0000\u0001\u001bb\u000bcȈ", new Object[]{"item_", IsCuratedItem.class, "statusCode_", "error_"});
        }
        if (iOrdinal == 3) {
            return new IsCuratedResponse();
        }
        if (iOrdinal == 4) {
            return new zc40(21);
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
        synchronized (IsCuratedResponse.class) {
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

    /* JADX INFO: renamed from: p */
    public final int m98129p() {
        return this.item_.size();
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m98130q() {
        return this.item_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
