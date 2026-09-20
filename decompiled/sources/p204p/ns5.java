package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class ns5 implements mko {

    /* JADX INFO: renamed from: b */
    public static final ns5 f157664b = new ns5(0);

    /* JADX INFO: renamed from: c */
    public static final ns5 f157665c = new ns5(1);

    /* JADX INFO: renamed from: d */
    public static final ns5 f157666d = new ns5(2);

    /* JADX INFO: renamed from: e */
    public static final ns5 f157667e = new ns5(3);

    /* JADX INFO: renamed from: f */
    public static final ns5 f157668f = new ns5(4);

    /* JADX INFO: renamed from: g */
    public static final ns5 f157669g = new ns5(5);

    /* JADX INFO: renamed from: h */
    public static final ns5 f157670h = new ns5(6);

    /* JADX INFO: renamed from: i */
    public static final ns5 f157671i = new ns5(7);

    /* JADX INFO: renamed from: j */
    public static final ns5 f157672j = new ns5(8);

    /* JADX INFO: renamed from: k */
    public static final ns5 f157673k = new ns5(9);

    /* JADX INFO: renamed from: l */
    public static final ns5 f157674l = new ns5(10);

    /* JADX INFO: renamed from: m */
    public static final ns5 f157675m = new ns5(11);

    /* JADX INFO: renamed from: n */
    public static final ns5 f157676n = new ns5(12);

    /* JADX INFO: renamed from: o */
    public static final ns5 f157677o = new ns5(13);

    /* JADX INFO: renamed from: p */
    public static final ns5 f157678p = new ns5(14);

    /* JADX INFO: renamed from: q */
    public static final ns5 f157679q = new ns5(15);

    /* JADX INFO: renamed from: r */
    public static final ns5 f157680r = new ns5(16);

    /* JADX INFO: renamed from: s */
    public static final ns5 f157681s = new ns5(17);

    /* JADX INFO: renamed from: t */
    public static final ns5 f157682t = new ns5(18);

    /* JADX INFO: renamed from: u */
    public static final ns5 f157683u = new ns5(19);

    /* JADX INFO: renamed from: v */
    public static final ns5 f157684v = new ns5(20);

    /* JADX INFO: renamed from: w */
    public static final ns5 f157685w = new ns5(21);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157686a;

    public /* synthetic */ ns5(int i) {
        this.f157686a = i;
    }

    /* JADX WARN: Type inference failed for: r10v35, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // p204p.mko
    /* JADX INFO: renamed from: a */
    public final lho mo28634a(Object obj) {
        switch (this.f157686a) {
            case 0:
                yec0 yec0Var = (yec0) obj;
                return yec0Var.f271967e ? a16.f11339a.mo28634a(yec0Var.f271963a) : new eau();
            case 1:
                return cua1.f42082a.mo28634a(((js6) obj).f115402a);
            case 2:
                return new eau();
            case 3:
                return new eau();
            case 4:
                return new eau();
            case 5:
                return new eau();
            case 6:
                return trf.f223056a.mo28634a(((orf) obj).f168549a);
            case 7:
                return new eau();
            case 8:
                return new eau();
            case 9:
                String str = (String) obj;
                return chg1.m32789u(chg1.m32789u(ya70.f270821h.mo28634a(str), ya70.f270822i.mo28634a(str)), ya70.f270823j.mo28634a(str));
            case 10:
                return new eau();
            case 11:
                return new eau();
            case 12:
                List<String> list = ((b5i0) obj).f23597a;
                int i = 1;
                if (list.isEmpty()) {
                    return new hq80(lau.f131415a, true);
                }
                ArrayList arrayList = new ArrayList();
                for (String str2 : list) {
                    jqv0 jqv0Var = qpv0.f191387a;
                    arrayList.add(new kho(new k35(new jqx(jqv0Var.mo54112b(v140.class)), str2), i, d3i0.f44911d));
                    arrayList.add(new kho(new k35(new jqx(jqv0Var.mo54112b(erc1.class)), str2), 2, d3i0.f44912e));
                }
                return new hq80(arrayList, true);
            case 13:
                ?? r10 = ((n5i0) obj).f150563a;
                int i2 = 1;
                if (r10.isEmpty()) {
                    return new hq80(lau.f131415a, true);
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str3 : r10) {
                    jqv0 jqv0Var2 = qpv0.f191387a;
                    arrayList2.add(new kho(new k35(new jqx(jqv0Var2.mo54112b(luh.class)), str3), i2, d3i0.f44913f));
                    arrayList2.add(new kho(new k35(new jqx(jqv0Var2.mo54112b(pfa0.class)), str3), i2, d3i0.f44914g));
                }
                String str4 = (String) g6f.m43745s0(r10);
                if (str4 != null) {
                    jqv0 jqv0Var3 = qpv0.f191387a;
                    arrayList2.add(new kho(new k35(new jqx(jqv0Var3.mo54112b(i3i.class)), str4), 2, d3i0.f44915h));
                    arrayList2.add(new kho(new k35(new jqx(jqv0Var3.mo54112b(efi.class)), str4), i2, d3i0.f44916i));
                }
                return new hq80(arrayList2, true);
            case 14:
                return lip0.f133860a.mo28634a((eip0) obj);
            case 15:
                ufc0 ufc0Var = (ufc0) obj;
                String str5 = ufc0Var.f229741b;
                return (str5 == null || !ufc0Var.f229747h) ? new eau() : a16.f11339a.mo28634a(str5);
            case 16:
                return new eau();
            case 17:
                return new eau();
            case 18:
                return new eau();
            case 19:
                return new eau();
            case 20:
                return new eau();
            case 21:
                List list2 = ((r9d1) obj).f197035c;
                if (list2.isEmpty()) {
                    return new hq80(lau.f131415a, true);
                }
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new kho(new k35(new jqx(qpv0.f191387a.mo54112b(ved1.class)), (String) it.next()), 2, b9d1.f24869f));
                }
                return new hq80(arrayList3, false);
            case 22:
                return new eau();
            default:
                if (((osf0) obj) instanceof osf0) {
                    return new eau();
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    public ns5(j5s j5sVar) {
        this.f157686a = 22;
    }
}
