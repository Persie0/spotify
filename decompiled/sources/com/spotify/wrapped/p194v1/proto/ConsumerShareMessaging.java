package com.spotify.wrapped.p194v1.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.nuh;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z8j;

/* JADX INFO: loaded from: classes11.dex */
public final class ConsumerShareMessaging extends AbstractC0269h implements sre0 {
    private static final ConsumerShareMessaging DEFAULT_INSTANCE;
    public static final int FREE_TEXT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int QUERY_PARAMETERS_FIELD_NUMBER = 1;
    public static final int SHARE_URI_FIELD_NUMBER = 3;
    private ihc0 queryParameters_ = ihc0.f102235b;
    private String freeText_ = "";
    private String shareUri_ = "";

    static {
        ConsumerShareMessaging consumerShareMessaging = new ConsumerShareMessaging();
        DEFAULT_INSTANCE = consumerShareMessaging;
        AbstractC0269h.registerDefaultInstance(ConsumerShareMessaging.class, consumerShareMessaging);
    }

    private ConsumerShareMessaging() {
    }

    /* JADX INFO: renamed from: n */
    public static ConsumerShareMessaging m23136n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002Ȉ\u0003Ȉ", new Object[]{"queryParameters_", z8j.f280489a, "freeText_", "shareUri_"});
        }
        if (iOrdinal == 3) {
            return new ConsumerShareMessaging();
        }
        if (iOrdinal == 4) {
            return new nuh(DEFAULT_INSTANCE, 25);
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
        synchronized (ConsumerShareMessaging.class) {
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
    public final String m23137o() {
        return this.freeText_;
    }

    /* JADX INFO: renamed from: p */
    public final Map m23138p() {
        return Collections.unmodifiableMap(this.queryParameters_);
    }

    /* JADX INFO: renamed from: q */
    public final String m23139q() {
        return this.shareUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
