package p204p;

import androidx.car.app.model.Alert;
import com.comscore.streaming.AdvertisementType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class ubf1 extends s9f1 {

    /* JADX INFO: renamed from: h */
    public static final int[] f228741h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, AdvertisementType.BRANDED_ON_DEMAND_POST_ROLL, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Alert.DURATION_SHOW_INDEFINITELY};

    /* JADX INFO: renamed from: c */
    public final int f228742c;

    /* JADX INFO: renamed from: d */
    public final s9f1 f228743d;

    /* JADX INFO: renamed from: e */
    public final s9f1 f228744e;

    /* JADX INFO: renamed from: f */
    public final int f228745f;

    /* JADX INFO: renamed from: g */
    public final int f228746g;

    public ubf1(s9f1 s9f1Var, s9f1 s9f1Var2) {
        this.f228743d = s9f1Var;
        this.f228744e = s9f1Var2;
        int iMo69377e = s9f1Var.mo69377e();
        this.f228745f = iMo69377e;
        this.f228742c = s9f1Var2.mo69377e() + iMo69377e;
        this.f228746g = Math.max(s9f1Var.mo72366s(), s9f1Var2.mo72366s()) + 1;
    }

    /* JADX INFO: renamed from: A */
    public static int m82726A(int i) {
        return i >= 47 ? Alert.DURATION_SHOW_INDEFINITELY : f228741h[i];
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: d */
    public final byte mo69376d(int i) {
        int i2 = this.f228745f;
        return i < i2 ? this.f228743d.mo69376d(i) : this.f228744e.mo69376d(i - i2);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: e */
    public final int mo69377e() {
        return this.f228742c;
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: f */
    public final s9f1 mo69378f(int i, int i2) {
        return mo69379i(i, i2);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: i */
    public final s9f1 mo69379i(int i, int i2) {
        int i3 = this.f228742c;
        int iM77577a = s9f1.m77577a(i, i2, i3);
        if (iM77577a == 0) {
            return s9f1.f206952b;
        }
        if (iM77577a == i3) {
            return this;
        }
        s9f1 s9f1Var = this.f228743d;
        int i4 = this.f228745f;
        if (i2 <= i4) {
            return s9f1Var.mo69378f(i, i2);
        }
        int i5 = i2 - i4;
        s9f1 s9f1Var2 = this.f228744e;
        return i >= i4 ? s9f1Var2.mo69378f(i - i4, i5) : new ubf1(s9f1Var.mo69378f(i, s9f1Var.mo69377e()), s9f1Var2.mo69378f(0, i5));
    }

    @Override // p204p.s9f1, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new tbf1(this);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: j */
    public final void mo69380j(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        s9f1 s9f1Var = this.f228743d;
        int i5 = this.f228745f;
        if (i4 <= i5) {
            s9f1Var.mo69380j(bArr, i, i2, i3);
            return;
        }
        s9f1 s9f1Var2 = this.f228744e;
        if (i >= i5) {
            s9f1Var2.mo69380j(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        s9f1Var.mo69380j(bArr, i, i2, i6);
        s9f1Var2.mo69380j(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: m */
    public final void mo69382m(w780 w780Var) {
        this.f228743d.mo69382m(w780Var);
        this.f228744e.mo69382m(w780Var);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: n */
    public final String mo69383n() {
        return new String(m77584y(), StandardCharsets.UTF_8);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: o */
    public final boolean mo69384o(s9f1 s9f1Var) {
        q9f1 q9f1VarM32763b;
        chc0 chc0Var = new chc0(this);
        q9f1 q9f1VarM32763b2 = chc0Var.m32763b();
        chc0 chc0Var2 = new chc0(s9f1Var);
        q9f1 q9f1VarM32763b3 = chc0Var2.m32763b();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iMo69377e = q9f1VarM32763b2.mo69377e() - i;
            int iMo69377e2 = q9f1VarM32763b3.mo69377e() - i2;
            int iMin = Math.min(iMo69377e, iMo69377e2);
            if (!(i == 0 ? q9f1VarM32763b2.mo69375A(q9f1VarM32763b3, i2, iMin) : q9f1VarM32763b3.mo69375A(q9f1VarM32763b2, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.f228742c;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iMo69377e) {
                q9f1VarM32763b = chc0Var.m32763b();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iMo69377e2) {
                q9f1VarM32763b2 = q9f1VarM32763b2;
                q9f1VarM32763b2 = q9f1VarM32763b;
                q9f1VarM32763b3 = chc0Var2.m32763b();
                i2 = 0;
            } else {
                q9f1VarM32763b2 = q9f1VarM32763b2;
                q9f1VarM32763b2 = q9f1VarM32763b;
                i2 += iMin;
            }
        }
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: q */
    public final int mo69385q(int i, int i2, int i3) {
        int i4 = i2 + i3;
        s9f1 s9f1Var = this.f228743d;
        int i5 = this.f228745f;
        if (i4 <= i5) {
            return s9f1Var.mo69385q(i, i2, i3);
        }
        s9f1 s9f1Var2 = this.f228744e;
        if (i2 >= i5) {
            return s9f1Var2.mo69385q(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return s9f1Var2.mo69385q(s9f1Var.mo69385q(i, i2, i6), 0, i3 - i6);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: r */
    public final v9f1 mo69386r() {
        q9f1 q9f1Var;
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f228746g);
        arrayDeque.push(this);
        s9f1 s9f1Var = this.f228743d;
        while (s9f1Var instanceof ubf1) {
            ubf1 ubf1Var = (ubf1) s9f1Var;
            arrayDeque.push(ubf1Var);
            s9f1Var = ubf1Var.f228743d;
        }
        q9f1 q9f1Var2 = (q9f1) s9f1Var;
        while (true) {
            if (!(q9f1Var2 != null)) {
                bbf1 bbf1Var = new bbf1();
                bbf1Var.f25550a = arrayList.iterator();
                bbf1Var.f25552c = 0;
                for (ByteBuffer byteBuffer : arrayList) {
                    bbf1Var.f25552c++;
                }
                bbf1Var.f25553d = -1;
                if (!bbf1Var.m28635a()) {
                    bbf1Var.f25551b = abf1.f14108b;
                    bbf1Var.f25554e = 0;
                }
                return new u9f1(bbf1Var);
            }
            if (q9f1Var2 == null) {
                throw new NoSuchElementException();
            }
            do {
                if (arrayDeque.isEmpty()) {
                    q9f1Var = null;
                    break;
                }
                s9f1 s9f1Var2 = ((ubf1) arrayDeque.pop()).f228744e;
                while (s9f1Var2 instanceof ubf1) {
                    ubf1 ubf1Var2 = (ubf1) s9f1Var2;
                    arrayDeque.push(ubf1Var2);
                    s9f1Var2 = ubf1Var2.f228743d;
                }
                q9f1Var = (q9f1) s9f1Var2;
            } while (q9f1Var.m77583v());
            arrayList.add(q9f1Var2.mo69381l());
            q9f1Var2 = q9f1Var;
        }
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: s */
    public final int mo72366s() {
        return this.f228746g;
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: t */
    public final boolean mo72367t() {
        return this.f228742c >= m82726A(this.f228746g);
    }

    @Override // p204p.s9f1
    /* JADX INFO: renamed from: u */
    public final o0f1 iterator() {
        return new tbf1(this);
    }
}
