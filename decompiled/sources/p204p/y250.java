package p204p;

import android.view.ViewGroup;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class y250 extends it1 {

    /* JADX INFO: renamed from: e */
    public List f268455e;

    /* JADX INFO: renamed from: f */
    public boolean f268456f;

    /* JADX INFO: renamed from: g */
    public final kca f268457g;

    /* JADX INFO: renamed from: h */
    public final at31 f268458h;

    /* JADX INFO: renamed from: i */
    public List f268459i;

    /* JADX INFO: renamed from: t */
    public String f268460t;

    public y250(kca kcaVar) {
        super(1);
        this.f268455e = new ArrayList();
        this.f268456f = true;
        hcb hcbVar = new hcb(this);
        at31 at31Var = new at31();
        at31Var.f19583a = (Object[]) Array.newInstance((Class<?>) gcb.class, 10);
        at31Var.f19588f = hcbVar;
        at31Var.f19590h = 0;
        this.f268458h = at31Var;
        this.f268459i = lau.f131415a;
        this.f268460t = "";
        this.f268456f = false;
        this.f268457g = kcaVar;
    }

    /* JADX INFO: renamed from: B */
    public final void m92690B() {
        ArrayList arrayList;
        int i;
        int i2 = 0;
        if (this.f268460t.length() == 0) {
            arrayList = new ArrayList(this.f268459i);
        } else {
            List list = this.f268459i;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (wl51.m88496t0(((gcb) obj).f78532c.toLowerCase(new Locale(ihf1.m50632p())), this.f268460t, false)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        this.f268455e = arrayList;
        if (this.f268456f) {
            m47712h();
        }
        at31 at31Var = this.f268458h;
        if (at31Var.f19584b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
        zs31 zs31Var = at31Var.f19588f;
        if (!(zs31Var instanceof ys31)) {
            if (at31Var.f19589g == null) {
                at31Var.f19589g = new ys31(zs31Var);
            }
            at31Var.f19588f = at31Var.f19589g;
        }
        if (at31Var.f19584b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
        int i3 = at31Var.f19590h;
        if (i3 != 0) {
            Arrays.fill(at31Var.f19583a, 0, i3, (Object) null);
            at31Var.f19590h = 0;
            at31Var.f19588f.mo47104c(0, i3);
        }
        Object[] array = arrayList.toArray((Object[]) Array.newInstance((Class<?>) gcb.class, arrayList.size()));
        if (at31Var.f19584b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
        if (array.length != 0 && array.length >= 1) {
            if (array.length == 0) {
                i = 0;
            } else {
                Arrays.sort(array, at31Var.f19588f);
                int i4 = 0;
                i = 1;
                for (int i5 = 1; i5 < array.length; i5++) {
                    Object obj2 = array[i5];
                    if (at31Var.f19588f.compare(array[i4], obj2) == 0) {
                        int i6 = i4;
                        while (true) {
                            if (i6 >= i) {
                                i6 = -1;
                                break;
                            } else if (at31Var.f19588f.mo47107f(array[i6], obj2)) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        if (i6 != -1) {
                            array[i6] = obj2;
                        } else {
                            if (i != i5) {
                                array[i] = obj2;
                            }
                            i++;
                        }
                    } else {
                        if (i != i5) {
                            array[i] = obj2;
                        }
                        i4 = i;
                        i++;
                    }
                }
            }
            if (at31Var.f19590h == 0) {
                at31Var.f19583a = array;
                at31Var.f19590h = i;
                at31Var.f19588f.mo47102a(0, i);
            } else {
                zs31 zs31Var2 = at31Var.f19588f;
                boolean z = zs31Var2 instanceof ys31;
                if (!z) {
                    if (at31Var.f19584b != null) {
                        throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
                    }
                    if (!z) {
                        if (at31Var.f19589g == null) {
                            at31Var.f19589g = new ys31(zs31Var2);
                        }
                        at31Var.f19588f = at31Var.f19589g;
                    }
                }
                at31Var.f19584b = at31Var.f19583a;
                at31Var.f19585c = 0;
                int i7 = at31Var.f19590h;
                at31Var.f19586d = i7;
                at31Var.f19583a = (Object[]) Array.newInstance((Class<?>) gcb.class, i7 + i + 10);
                at31Var.f19587e = 0;
                while (true) {
                    int i8 = at31Var.f19585c;
                    int i9 = at31Var.f19586d;
                    if (i8 >= i9 && i2 >= i) {
                        break;
                    }
                    if (i8 == i9) {
                        int i10 = i - i2;
                        System.arraycopy(array, i2, at31Var.f19583a, at31Var.f19587e, i10);
                        int i11 = at31Var.f19587e + i10;
                        at31Var.f19587e = i11;
                        at31Var.f19590h += i10;
                        at31Var.f19588f.mo47102a(i11 - i10, i10);
                        break;
                    }
                    if (i2 == i) {
                        int i12 = i9 - i8;
                        System.arraycopy(at31Var.f19584b, i8, at31Var.f19583a, at31Var.f19587e, i12);
                        at31Var.f19587e += i12;
                        break;
                    }
                    Object obj3 = at31Var.f19584b[i8];
                    Object obj4 = array[i2];
                    int iCompare = at31Var.f19588f.compare(obj3, obj4);
                    if (iCompare > 0) {
                        Object[] objArr = at31Var.f19583a;
                        int i13 = at31Var.f19587e;
                        at31Var.f19587e = i13 + 1;
                        objArr[i13] = obj4;
                        at31Var.f19590h++;
                        i2++;
                        at31Var.f19588f.mo47102a(i13, 1);
                    } else if (iCompare == 0 && at31Var.f19588f.mo47107f(obj3, obj4)) {
                        Object[] objArr2 = at31Var.f19583a;
                        int i14 = at31Var.f19587e;
                        at31Var.f19587e = i14 + 1;
                        objArr2[i14] = obj4;
                        i2++;
                        at31Var.f19585c++;
                        if (!at31Var.f19588f.mo47103b(obj3, obj4)) {
                            zs31 zs31Var3 = at31Var.f19588f;
                            zs31Var3.mo47105d(at31Var.f19587e - 1, 1, zs31Var3.mo94427g(obj3, obj4));
                        }
                    } else {
                        Object[] objArr3 = at31Var.f19583a;
                        int i15 = at31Var.f19587e;
                        at31Var.f19587e = i15 + 1;
                        objArr3[i15] = obj3;
                        at31Var.f19585c++;
                    }
                }
                at31Var.f19584b = null;
                if (!z) {
                    at31Var.m27111a();
                }
            }
        }
        at31Var.m27111a();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return this.f268455e.size();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        ((lkv0) dkv0Var).mo27077D(i, this.f268455e.get(i));
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        return new z250(viewGroup, this.f268457g);
    }
}
