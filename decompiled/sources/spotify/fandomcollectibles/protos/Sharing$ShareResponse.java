package spotify.fandomcollectibles.protos;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ui01;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class Sharing$ShareResponse extends AbstractC0269h implements sre0 {
    private static final Sharing$ShareResponse DEFAULT_INSTANCE;
    public static final int MESSAGE_PREFIX_TEXT_FIELD_NUMBER = 4;
    public static final int MESSAGE_SUFFIX_TEXT_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int QUERY_PARAMS_FIELD_NUMBER = 3;
    public static final int SHARE_IMG_URL_FIELD_NUMBER = 1;
    public static final int SHARE_URI_FIELD_NUMBER = 2;
    private String shareImgUrl_ = "";
    private String shareUri_ = "";
    private ae50 queryParams_ = AbstractC0269h.emptyProtobufList();
    private String messagePrefixText_ = "";
    private String messageSuffixText_ = "";

    static {
        Sharing$ShareResponse sharing$ShareResponse = new Sharing$ShareResponse();
        DEFAULT_INSTANCE = sharing$ShareResponse;
        AbstractC0269h.registerDefaultInstance(Sharing$ShareResponse.class, sharing$ShareResponse);
    }

    private Sharing$ShareResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004Ȉ\u0005Ȉ", new Object[]{"shareImgUrl_", "shareUri_", "queryParams_", Sharing$QueryParameter.class, "messagePrefixText_", "messageSuffixText_"});
        }
        if (iOrdinal == 3) {
            return new Sharing$ShareResponse();
        }
        if (iOrdinal == 4) {
            return new ui01(DEFAULT_INSTANCE, 27);
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
        synchronized (Sharing$ShareResponse.class) {
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
    public final String m97606n() {
        return this.messagePrefixText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m97607o() {
        return this.messageSuffixText_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m97608p() {
        return this.queryParams_;
    }

    /* JADX INFO: renamed from: q */
    public final String m97609q() {
        return this.shareImgUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final String m97610r() {
        return this.shareUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
