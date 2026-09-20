package spotify.creators.p206v1.creatorfanfunding;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xbl;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class CreatorFanFunding extends AbstractC0269h implements sre0 {
    public static final int CHANNEL_FIELD_NUMBER = 1;
    private static final CreatorFanFunding DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 2;
    private String channel_ = "";
    private String url_ = "";

    static {
        CreatorFanFunding creatorFanFunding = new CreatorFanFunding();
        DEFAULT_INSTANCE = creatorFanFunding;
        AbstractC0269h.registerDefaultInstance(CreatorFanFunding.class, creatorFanFunding);
    }

    private CreatorFanFunding() {
    }

    /* JADX INFO: renamed from: o */
    public static CreatorFanFunding m97581o(byte[] bArr) {
        return (CreatorFanFunding) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"channel_", "url_"});
        }
        if (iOrdinal == 3) {
            return new CreatorFanFunding();
        }
        if (iOrdinal == 4) {
            return new xbl(DEFAULT_INSTANCE, 14);
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
        synchronized (CreatorFanFunding.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    /* JADX INFO: renamed from: n */
    public final String m97582n() {
        return this.channel_;
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
