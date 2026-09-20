package p204p;

import androidx.datastore.preferences.protobuf.AbstractC0044a;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class muy {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f147451c = 0;

    /* JADX INFO: renamed from: a */
    public final pv21 f147452a = new pv21(16);

    /* JADX INFO: renamed from: b */
    public boolean f147453b;

    static {
        new muy(0);
    }

    public muy() {
    }

    /* JADX INFO: renamed from: b */
    public static void m62881b(twe tweVar, xyd1 xyd1Var, int i, Object obj) {
        if (xyd1Var == xyd1.f267300d) {
            tweVar.m81726h1(i, 3);
            ((AbstractC0044a) obj).mo428c(tweVar);
            tweVar.m81726h1(i, 4);
        }
        tweVar.m81726h1(i, xyd1Var.f267304b);
        switch (xyd1Var.ordinal()) {
            case 0:
                tweVar.m81709V0(((Double) obj).doubleValue());
                break;
            case 1:
                tweVar.m81715a1(((Float) obj).floatValue());
                break;
            case 2:
                tweVar.m81730l1(((Long) obj).longValue());
                break;
            case 3:
                tweVar.m81730l1(((Long) obj).longValue());
                break;
            case 4:
                tweVar.m81717c1(((Integer) obj).intValue());
                break;
            case 5:
                tweVar.m81714Z0(((Long) obj).longValue());
                break;
            case 6:
                tweVar.m81711X0(((Integer) obj).intValue());
                break;
            case 7:
                tweVar.m81704Q0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof dva)) {
                    tweVar.m81725g1((String) obj);
                } else {
                    tweVar.m81708U0((dva) obj);
                }
                break;
            case 9:
                tweVar.getClass();
                ((AbstractC0044a) obj).mo428c(tweVar);
                break;
            case 10:
                AbstractC0044a abstractC0044a = (AbstractC0044a) obj;
                tweVar.getClass();
                tweVar.m81728j1(abstractC0044a.mo426a());
                abstractC0044a.mo428c(tweVar);
                break;
            case 11:
                if (!(obj instanceof dva)) {
                    byte[] bArr = (byte[]) obj;
                    tweVar.getClass();
                    int length = bArr.length;
                    tweVar.m81728j1(length);
                    tweVar.m81705R0(bArr, 0, length);
                } else {
                    tweVar.m81708U0((dva) obj);
                }
                break;
            case 12:
                tweVar.m81728j1(((Integer) obj).intValue());
                break;
            case 13:
                tweVar.m81717c1(((Integer) obj).intValue());
                break;
            case 14:
                tweVar.m81711X0(((Integer) obj).intValue());
                break;
            case 15:
                tweVar.m81714Z0(((Long) obj).longValue());
                break;
            case 16:
                tweVar.m81719d1(((Integer) obj).intValue());
                break;
            case 17:
                tweVar.m81721e1(((Long) obj).longValue());
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m62882a() {
        if (this.f147453b) {
            return;
        }
        pv21 pv21Var = this.f147452a;
        if (!pv21Var.f181582d) {
            if (pv21Var.f181580b.size() > 0) {
                ikc0.m50942n(pv21Var.m71107c(0).getKey());
                throw null;
            }
            Iterator it = pv21Var.m71108d().iterator();
            if (it.hasNext()) {
                ikc0.m50942n(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        if (!pv21Var.f181582d) {
            pv21Var.f181581c = pv21Var.f181581c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(pv21Var.f181581c);
            pv21Var.f181584f = pv21Var.f181584f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(pv21Var.f181584f);
            pv21Var.f181582d = true;
        }
        this.f147453b = true;
    }

    public final Object clone() {
        muy muyVar = new muy();
        pv21 pv21Var = this.f147452a;
        if (pv21Var.f181580b.size() > 0) {
            Map.Entry entryM71107c = pv21Var.m71107c(0);
            ikc0.m50942n(entryM71107c.getKey());
            entryM71107c.getValue();
            throw null;
        }
        Iterator it = pv21Var.m71108d().iterator();
        if (!it.hasNext()) {
            return muyVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ikc0.m50942n(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof muy) {
            return this.f147452a.equals(((muy) obj).f147452a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f147452a.hashCode();
    }

    public muy(int i) {
        m62882a();
        m62882a();
    }
}
