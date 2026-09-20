package p204p;

import androidx.car.app.model.Alert;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class cr81 {

    /* JADX INFO: renamed from: A */
    public boolean f41205A;

    /* JADX INFO: renamed from: B */
    public pf40 f41206B;

    /* JADX INFO: renamed from: C */
    public int f41207C;

    /* JADX INFO: renamed from: D */
    public boolean f41208D;

    /* JADX INFO: renamed from: E */
    public boolean f41209E;

    /* JADX INFO: renamed from: F */
    public boolean f41210F;

    /* JADX INFO: renamed from: G */
    public boolean f41211G;

    /* JADX INFO: renamed from: H */
    public HashMap f41212H;

    /* JADX INFO: renamed from: I */
    public HashSet f41213I;

    /* JADX INFO: renamed from: e */
    public int f41218e;

    /* JADX INFO: renamed from: f */
    public int f41219f;

    /* JADX INFO: renamed from: g */
    public int f41220g;

    /* JADX INFO: renamed from: h */
    public int f41221h;

    /* JADX INFO: renamed from: m */
    public pf40 f41226m;

    /* JADX INFO: renamed from: n */
    public pf40 f41227n;

    /* JADX INFO: renamed from: o */
    public pf40 f41228o;

    /* JADX INFO: renamed from: p */
    public int f41229p;

    /* JADX INFO: renamed from: q */
    public pf40 f41230q;

    /* JADX INFO: renamed from: r */
    public pf40 f41231r;

    /* JADX INFO: renamed from: s */
    public int f41232s;

    /* JADX INFO: renamed from: t */
    public int f41233t;

    /* JADX INFO: renamed from: u */
    public int f41234u;

    /* JADX INFO: renamed from: v */
    public pf40 f41235v;

    /* JADX INFO: renamed from: w */
    public br81 f41236w;

    /* JADX INFO: renamed from: x */
    public boolean f41237x;

    /* JADX INFO: renamed from: y */
    public pf40 f41238y;

    /* JADX INFO: renamed from: z */
    public int f41239z;

    /* JADX INFO: renamed from: a */
    public int f41214a = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: b */
    public int f41215b = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: c */
    public int f41216c = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: d */
    public int f41217d = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: i */
    public int f41222i = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: j */
    public int f41223j = Alert.DURATION_SHOW_INDEFINITELY;

    /* JADX INFO: renamed from: k */
    public boolean f41224k = true;

    /* JADX INFO: renamed from: l */
    public boolean f41225l = true;

    public cr81() {
        kf40 kf40Var = pf40.f176960b;
        wsv0 wsv0Var = wsv0.f254763e;
        this.f41226m = wsv0Var;
        this.f41227n = wsv0Var;
        this.f41228o = wsv0Var;
        this.f41229p = 0;
        this.f41230q = wsv0Var;
        this.f41231r = wsv0Var;
        this.f41232s = 0;
        this.f41233t = Alert.DURATION_SHOW_INDEFINITELY;
        this.f41234u = Alert.DURATION_SHOW_INDEFINITELY;
        this.f41235v = wsv0Var;
        this.f41236w = br81.f30015d;
        this.f41237x = false;
        this.f41238y = wsv0Var;
        this.f41239z = 0;
        this.f41205A = true;
        this.f41206B = wsv0Var;
        this.f41207C = 0;
        this.f41208D = false;
        this.f41209E = false;
        this.f41210F = false;
        this.f41211G = false;
        this.f41212H = new HashMap();
        this.f41213I = new HashSet();
    }

    /* JADX INFO: renamed from: e */
    public static wsv0 m33724e(String[] strArr) {
        jf40 jf40VarM69788m = pf40.m69788m();
        for (String str : strArr) {
            str.getClass();
            jf40VarM69788m.m28985c(h0b1.m46296X(str));
        }
        return jf40VarM69788m.m53150g();
    }

    /* JADX INFO: renamed from: a */
    public void mo33725a(zq81 zq81Var) {
        this.f41212H.put(zq81Var.f285331a, zq81Var);
    }

    /* JADX INFO: renamed from: b */
    public dr81 mo33726b() {
        return new dr81(this);
    }

    /* JADX INFO: renamed from: c */
    public cr81 mo33727c() {
        this.f41212H.clear();
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m33728d(dr81 dr81Var) {
        this.f41214a = dr81Var.f52241a;
        this.f41215b = dr81Var.f52242b;
        this.f41216c = dr81Var.f52243c;
        this.f41217d = dr81Var.f52244d;
        this.f41218e = dr81Var.f52245e;
        this.f41219f = dr81Var.f52246f;
        this.f41220g = dr81Var.f52247g;
        this.f41221h = dr81Var.f52248h;
        this.f41222i = dr81Var.f52249i;
        this.f41223j = dr81Var.f52250j;
        this.f41224k = dr81Var.f52251k;
        this.f41225l = dr81Var.f52252l;
        this.f41227n = dr81Var.f52254n;
        this.f41226m = dr81Var.f52253m;
        this.f41228o = dr81Var.f52255o;
        this.f41229p = dr81Var.f52256p;
        this.f41230q = dr81Var.f52257q;
        this.f41232s = dr81Var.f52259s;
        this.f41231r = dr81Var.f52258r;
        this.f41233t = dr81Var.f52260t;
        this.f41234u = dr81Var.f52261u;
        this.f41235v = dr81Var.f52262v;
        this.f41236w = dr81Var.f52263w;
        this.f41237x = dr81Var.f52264x;
        this.f41238y = dr81Var.f52265y;
        this.f41239z = dr81Var.f52232A;
        this.f41205A = dr81Var.f52233B;
        this.f41206B = dr81Var.f52266z;
        this.f41207C = dr81Var.f52234C;
        this.f41208D = dr81Var.f52235D;
        this.f41209E = dr81Var.f52236E;
        this.f41210F = dr81Var.f52237F;
        this.f41211G = dr81Var.f52238G;
        this.f41213I = new HashSet(dr81Var.f52240I);
        this.f41212H = new HashMap(dr81Var.f52239H);
    }

    /* JADX INFO: renamed from: f */
    public cr81 mo33729f(zq81 zq81Var) {
        int i = zq81Var.f285331a.f122101c;
        Iterator it = this.f41212H.values().iterator();
        while (it.hasNext()) {
            if (((zq81) it.next()).f285331a.f122101c == i) {
                it.remove();
            }
        }
        this.f41212H.put(zq81Var.f285331a, zq81Var);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public cr81 mo33730g(String... strArr) {
        this.f41230q = m33724e(strArr);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public cr81 mo33731h(String... strArr) {
        this.f41238y = m33724e(strArr);
        this.f41205A = false;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public void m33732i(int i, boolean z) {
        if (z) {
            this.f41213I.add(Integer.valueOf(i));
        } else {
            this.f41213I.remove(Integer.valueOf(i));
        }
    }
}
