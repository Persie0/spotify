package p204p;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes11.dex */
public abstract class hva implements Iterable {

    /* JADX INFO: renamed from: a */
    public static final xj90 f95637a = new xj90(new byte[0]);

    /* JADX INFO: renamed from: a */
    public static hva m48761a(Iterator it, int i) {
        if (i == 1) {
            return (hva) it.next();
        }
        int i2 = i >>> 1;
        return m48761a(it, i2).m48763b(m48761a(it, i - i2));
    }

    /* JADX INFO: renamed from: l */
    public static eva m48762l() {
        return new eva(0);
    }

    /* JADX INFO: renamed from: b */
    public final hva m48763b(hva hvaVar) {
        int size = size();
        int size2 = hvaVar.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = ukx0.f231380h;
        ukx0 ukx0Var = this instanceof ukx0 ? (ukx0) this : null;
        if (hvaVar.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return hvaVar;
        }
        int size3 = hvaVar.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = hvaVar.size();
            byte[] bArr = new byte[size4 + size5];
            m48764d(0, bArr, 0, size4);
            hvaVar.m48764d(0, bArr, size4, size5);
            return new xj90(bArr);
        }
        if (ukx0Var != null) {
            hva hvaVar2 = ukx0Var.f231383d;
            if (hvaVar.size() + hvaVar2.size() < 128) {
                int size6 = hvaVar2.size();
                int size7 = hvaVar.size();
                byte[] bArr2 = new byte[size6 + size7];
                hvaVar2.m48764d(0, bArr2, 0, size6);
                hvaVar.m48764d(0, bArr2, size6, size7);
                return new ukx0(ukx0Var.f231382c, new xj90(bArr2));
            }
        }
        if (ukx0Var != null) {
            hva hvaVar3 = ukx0Var.f231383d;
            hva hvaVar4 = ukx0Var.f231382c;
            if (hvaVar4.mo48766f() > hvaVar3.mo48766f() && ukx0Var.f231385f > hvaVar.mo48766f()) {
                return new ukx0(hvaVar4, new ukx0(hvaVar3, hvaVar));
            }
        }
        if (size3 >= ukx0.f231380h[Math.max(mo48766f(), hvaVar.mo48766f()) + 1]) {
            return new ukx0(this, hvaVar);
        }
        rwt0 rwt0Var = new rwt0();
        rwt0Var.m76581b(this);
        rwt0Var.m76581b(hvaVar);
        Stack stack = (Stack) rwt0Var.f203414b;
        hva ukx0Var2 = (hva) stack.pop();
        while (!stack.isEmpty()) {
            ukx0Var2 = new ukx0((hva) stack.pop(), ukx0Var2);
        }
        return ukx0Var2;
    }

    /* JADX INFO: renamed from: d */
    public final void m48764d(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                mo48765e(i, bArr, i2, i3);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo48765e(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: f */
    public abstract int mo48766f();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo48767i();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo48768j();

    /* JADX INFO: renamed from: m */
    public abstract int mo48769m(int i, int i2, int i3);

    /* JADX INFO: renamed from: n */
    public abstract int mo48770n(int i, int i2, int i3);

    /* JADX INFO: renamed from: o */
    public abstract int mo48771o();

    /* JADX INFO: renamed from: p */
    public abstract String mo48772p();

    /* JADX INFO: renamed from: q */
    public final String m48773q() {
        try {
            return mo48772p();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo48774r(OutputStream outputStream, int i, int i2);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
