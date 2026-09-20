package spotify.your_library.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.f591;
import p204p.ore0;
import p204p.p981;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class TransferProgress extends AbstractC0269h implements sre0 {
    private static final TransferProgress DEFAULT_INSTANCE;
    public static final int ITEMS_MOVED_FIELD_NUMBER = 4;
    public static final int ITEMS_TOTAL_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TRANSFER_ID_FIELD_NUMBER = 1;
    private int itemsMoved_;
    private int itemsTotal_;
    private float progress_;
    private int status_;
    private String transferId_ = "";

    static {
        TransferProgress transferProgress = new TransferProgress();
        DEFAULT_INSTANCE = transferProgress;
        AbstractC0269h.registerDefaultInstance(TransferProgress.class, transferProgress);
    }

    private TransferProgress() {
    }

    /* JADX INFO: renamed from: n */
    public static TransferProgress m98137n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0001\u0004\u0004\u0005\u0004", new Object[]{"transferId_", "status_", "progress_", "itemsMoved_", "itemsTotal_"});
        }
        if (iOrdinal == 3) {
            return new TransferProgress();
        }
        if (iOrdinal == 4) {
            return new p981(DEFAULT_INSTANCE, 27);
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
        synchronized (TransferProgress.class) {
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
    public final int m98138o() {
        return this.itemsMoved_;
    }

    /* JADX INFO: renamed from: p */
    public final int m98139p() {
        return this.itemsTotal_;
    }

    /* JADX INFO: renamed from: q */
    public final float m98140q() {
        return this.progress_;
    }

    /* JADX INFO: renamed from: r */
    public final f591 m98141r() {
        f591 f591Var;
        int i = this.status_;
        if (i != 0) {
            f591Var = i != 1 ? null : f591.COMPLETED;
        } else {
            f591Var = f591.IN_PROGRESS;
        }
        return f591Var == null ? f591.UNRECOGNIZED : f591Var;
    }

    /* JADX INFO: renamed from: s */
    public final String m98142s() {
        return this.transferId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
