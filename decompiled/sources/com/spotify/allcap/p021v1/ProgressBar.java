package com.spotify.allcap.p021v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t3r0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressBar extends AbstractC0269h implements sre0 {
    private static final ProgressBar DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REMAINING_QUOTA_FIELD_NUMBER = 2;
    public static final int SEGMENTS_FIELD_NUMBER = 3;
    public static final int USED_QUOTA_FIELD_NUMBER = 1;
    private String usedQuota_ = "";
    private String remainingQuota_ = "";
    private ae50 segments_ = AbstractC0269h.emptyProtobufList();

    static {
        ProgressBar progressBar = new ProgressBar();
        DEFAULT_INSTANCE = progressBar;
        AbstractC0269h.registerDefaultInstance(ProgressBar.class, progressBar);
    }

    private ProgressBar() {
    }

    /* JADX INFO: renamed from: n */
    public static ProgressBar m3240n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b", new Object[]{"usedQuota_", "remainingQuota_", "segments_", ProgressBarSegment.class});
        }
        if (iOrdinal == 3) {
            return new ProgressBar();
        }
        if (iOrdinal == 4) {
            return new t3r0(DEFAULT_INSTANCE, 26);
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
        synchronized (ProgressBar.class) {
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
    public final String m3241o() {
        return this.remainingQuota_;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m3242p() {
        return this.segments_;
    }

    /* JADX INFO: renamed from: q */
    public final String m3243q() {
        return this.usedQuota_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
