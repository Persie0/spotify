package p204p;

import androidx.glance.appwidget.protobuf.AbstractC0059e;
import androidx.glance.appwidget.protobuf.C0057c;
import androidx.glance.appwidget.protobuf.C0058d;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class iq70 extends AbstractC0059e {
    private static final iq70 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile p2n0 PARSER;
    private yd50 layout_ = g3t0.f76281d;
    private int nextIndex_;

    static {
        iq70 iq70Var = new iq70();
        DEFAULT_INSTANCE = iq70Var;
        AbstractC0059e.m669i(iq70.class, iq70Var);
    }

    /* JADX INFO: renamed from: k */
    public static void m51342k(iq70 iq70Var, kq70 kq70Var) {
        iq70Var.getClass();
        yd50 yd50Var = iq70Var.layout_;
        if (!((AbstractC1659a9) yd50Var).f13439a) {
            g3t0 g3t0Var = (g3t0) yd50Var;
            int i = g3t0Var.f76283c;
            iq70Var.layout_ = g3t0Var.m43514d(i == 0 ? 10 : i * 2);
        }
        ((g3t0) iq70Var.layout_).add(kq70Var);
    }

    /* JADX INFO: renamed from: l */
    public static void m51343l(iq70 iq70Var) {
        iq70Var.getClass();
        iq70Var.layout_ = g3t0.f76281d;
    }

    /* JADX INFO: renamed from: m */
    public static void m51344m(iq70 iq70Var, int i) {
        iq70Var.nextIndex_ = i;
    }

    /* JADX INFO: renamed from: n */
    public static iq70 m51345n() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static iq70 m51346q(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
        iq70 iq70Var = DEFAULT_INSTANCE;
        C0057c c0057c = new C0057c(fileInputStream);
        ytx ytxVarM94643a = ytx.m94643a();
        AbstractC0059e abstractC0059eM673h = iq70Var.m673h();
        try {
            jgy0 jgy0VarM28054c = b3t0.m28052a().m28054c(abstractC0059eM673h);
            jgy0VarM28054c.mo704h(abstractC0059eM673h, C0058d.m643a(c0057c), ytxVarM94643a);
            jgy0VarM28054c.mo697a(abstractC0059eM673h);
            if (AbstractC0059e.m668e(abstractC0059eM673h, true)) {
                return (iq70) abstractC0059eM673h;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e) {
            if (e.f894a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0059e
    /* JADX INFO: renamed from: b */
    public final Object mo670b(int i) {
        p2n0 p110Var;
        switch (edb.m38547C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new bbu0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", kq70.class, "nextIndex_"});
            case 3:
                return new iq70();
            case 4:
                return new hq70(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p2n0 p2n0Var = PARSER;
                if (p2n0Var != null) {
                    return p2n0Var;
                }
                synchronized (iq70.class) {
                    try {
                        p110Var = PARSER;
                        if (p110Var == null) {
                            p110Var = new p110();
                            PARSER = p110Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return p110Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: o */
    public final yd50 m51347o() {
        return this.layout_;
    }

    /* JADX INFO: renamed from: p */
    public final int m51348p() {
        return this.nextIndex_;
    }
}
