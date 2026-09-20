package spotify.resumption_progress_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.h4x0;
import p204p.max0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ResumptionProgressEsperanto$GetProgressResponse extends AbstractC0269h implements sre0 {
    private static final ResumptionProgressEsperanto$GetProgressResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();
    private int result_;

    static {
        ResumptionProgressEsperanto$GetProgressResponse resumptionProgressEsperanto$GetProgressResponse = new ResumptionProgressEsperanto$GetProgressResponse();
        DEFAULT_INSTANCE = resumptionProgressEsperanto$GetProgressResponse;
        AbstractC0269h.registerDefaultInstance(ResumptionProgressEsperanto$GetProgressResponse.class, resumptionProgressEsperanto$GetProgressResponse);
    }

    private ResumptionProgressEsperanto$GetProgressResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static ResumptionProgressEsperanto$GetProgressResponse m97873o(byte[] bArr) {
        return (ResumptionProgressEsperanto$GetProgressResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"result_", "items_", ResumptionProgressEsperanto$ProgressItem.class});
        }
        if (iOrdinal == 3) {
            return new ResumptionProgressEsperanto$GetProgressResponse();
        }
        if (iOrdinal == 4) {
            return new h4x0(DEFAULT_INSTANCE, 6);
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
        synchronized (ResumptionProgressEsperanto$GetProgressResponse.class) {
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
    public final max0 m97874n() {
        max0 max0VarM61333a = max0.m61333a(this.result_);
        return max0VarM61333a == null ? max0.UNRECOGNIZED : max0VarM61333a;
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
