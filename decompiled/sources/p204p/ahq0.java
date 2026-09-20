package p204p;

import androidx.datastore.preferences.protobuf.AbstractC0048e;
import androidx.datastore.preferences.protobuf.C0047d;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ahq0 extends AbstractC0048e {
    private static final ahq0 DEFAULT_INSTANCE;
    private static volatile t2n0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private jhc0 preferences_ = jhc0.f112388b;

    static {
        ahq0 ahq0Var = new ahq0();
        DEFAULT_INSTANCE = ahq0Var;
        AbstractC0048e.m520h(ahq0.class, ahq0Var);
    }

    /* JADX INFO: renamed from: i */
    public static jhc0 m25994i(ahq0 ahq0Var) {
        jhc0 jhc0Var = ahq0Var.preferences_;
        if (!jhc0Var.f112389a) {
            ahq0Var.preferences_ = jhc0Var.m53375c();
        }
        return ahq0Var.preferences_;
    }

    /* JADX INFO: renamed from: k */
    public static ygq0 m25995k() {
        return (ygq0) ((o110) DEFAULT_INSTANCE.mo521d(5));
    }

    /* JADX INFO: renamed from: l */
    public static ahq0 m25996l(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
        ahq0 ahq0Var = DEFAULT_INSTANCE;
        ptc ptcVarM70921r0 = ptc.m70921r0(fileInputStream);
        cux cuxVarM33955a = cux.m33955a();
        AbstractC0048e abstractC0048e = (AbstractC0048e) ahq0Var.mo521d(4);
        try {
            f3t0 f3t0Var = f3t0.f65577c;
            f3t0Var.getClass();
            mgy0 mgy0VarM40698a = f3t0Var.m40698a(abstractC0048e.getClass());
            mgy0VarM40698a.mo549i(abstractC0048e, C0047d.m472M(ptcVarM70921r0), cuxVarM33955a);
            mgy0VarM40698a.mo541a(abstractC0048e);
            if (abstractC0048e.m522g()) {
                return (ahq0) abstractC0048e;
            }
            throw new UninitializedMessageException().m425a();
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0048e
    /* JADX INFO: renamed from: d */
    public final Object mo521d(int i) {
        t2n0 s110Var;
        switch (edb.m38547C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ebu0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", zgq0.f282697a});
            case 3:
                return new ahq0();
            case 4:
                return new ygq0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t2n0 t2n0Var = PARSER;
                if (t2n0Var != null) {
                    return t2n0Var;
                }
                synchronized (ahq0.class) {
                    try {
                        s110Var = PARSER;
                        if (s110Var == null) {
                            s110Var = new s110();
                            PARSER = s110Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return s110Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: j */
    public final Map m25997j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
