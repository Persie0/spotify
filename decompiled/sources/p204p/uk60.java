package p204p;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class uk60 implements feu {

    /* JADX INFO: renamed from: f */
    public static final sk60 f231238f;

    /* JADX INFO: renamed from: g */
    public static final sk60 f231239g;

    /* JADX INFO: renamed from: a */
    public final HashMap f231241a;

    /* JADX INFO: renamed from: b */
    public final HashMap f231242b;

    /* JADX INFO: renamed from: c */
    public final rk60 f231243c;

    /* JADX INFO: renamed from: d */
    public boolean f231244d;

    /* JADX INFO: renamed from: e */
    public static final rk60 f231237e = new rk60();

    /* JADX INFO: renamed from: h */
    public static final tk60 f231240h = new tk60();

    /* JADX WARN: Type inference failed for: r0v1, types: [p.sk60] */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.sk60] */
    static {
        final int i = 0;
        f231238f = new l3b1() { // from class: p.sk60
            @Override // p204p.eeu
            /* JADX INFO: renamed from: a */
            public final void mo24360a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((m3b1) obj2).mo60660f((String) obj);
                        break;
                    default:
                        ((m3b1) obj2).mo60661g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        f231239g = new l3b1() { // from class: p.sk60
            @Override // p204p.eeu
            /* JADX INFO: renamed from: a */
            public final void mo24360a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((m3b1) obj2).mo60660f((String) obj);
                        break;
                    default:
                        ((m3b1) obj2).mo60661g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public uk60() {
        HashMap map = new HashMap();
        this.f231241a = map;
        HashMap map2 = new HashMap();
        this.f231242b = map2;
        this.f231243c = f231237e;
        this.f231244d = false;
        map2.put(String.class, f231238f);
        map.remove(String.class);
        map2.put(Boolean.class, f231239g);
        map.remove(Boolean.class);
        map2.put(Date.class, f231240h);
        map.remove(Date.class);
    }

    @Override // p204p.feu
    /* JADX INFO: renamed from: a */
    public final feu mo40967a(Class cls, amk0 amk0Var) {
        this.f231241a.put(cls, amk0Var);
        this.f231242b.remove(cls);
        return this;
    }
}
