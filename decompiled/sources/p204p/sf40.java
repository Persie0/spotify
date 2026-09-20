package p204p;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class sf40 extends ez8 implements lz80, Serializable {

    /* JADX INFO: renamed from: e */
    public final transient btv0 f208460e;

    /* JADX INFO: renamed from: f */
    public final transient int f208461f;

    public sf40(btv0 btv0Var, int i) {
        this.f208460e = btv0Var;
        this.f208461f = i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(s571.m77246e(i, "Invalid key count "));
        }
        vf40 vf40VarM90449a = xf40.m90449a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(s571.m77246e(i4, "Invalid value count "));
            }
            jf40 jf40VarM69788m = pf40.m69788m();
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                jf40VarM69788m.m28985c(object2);
            }
            vf40VarM90449a.mo85345e(object, jf40VarM69788m.m53150g());
            i2 += i4;
        }
        try {
            btv0 btv0VarM85342b = vf40VarM90449a.m85342b(true);
            vnt0 vnt0Var = ag40.f15281a;
            vnt0Var.getClass();
            try {
                ((Field) vnt0Var.f243248b).set(this, btv0VarM85342b);
                vnt0 vnt0Var2 = ag40.f15282b;
                vnt0Var2.getClass();
                try {
                    ((Field) vnt0Var2.f243248b).set(this, Integer.valueOf(i2));
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        kjg1.m56597t(this, objectOutputStream);
    }

    @Override // p204p.AbstractC2329r8, p204p.eai0
    /* JADX INFO: renamed from: a */
    public final Collection mo38299a() {
        return (ef40) super.mo38299a();
    }

    @Override // p204p.eai0
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.AbstractC2329r8
    /* JADX INFO: renamed from: d */
    public final boolean mo74960d(Object obj) {
        return obj != null && super.mo74960d(obj);
    }

    @Override // p204p.AbstractC2329r8
    /* JADX INFO: renamed from: e */
    public final Map mo43931e() {
        throw new AssertionError("should never be called");
    }

    @Override // p204p.AbstractC2329r8
    /* JADX INFO: renamed from: f */
    public final Collection mo43932f() {
        return new zf40(this);
    }

    @Override // p204p.AbstractC2329r8
    /* JADX INFO: renamed from: g */
    public final Set mo43933g() {
        throw new AssertionError("unreachable");
    }

    @Override // p204p.eai0
    public final Collection get(Object obj) {
        pf40 pf40Var = (pf40) this.f208460e.get(obj);
        if (pf40Var != null) {
            return pf40Var;
        }
        kf40 kf40Var = pf40.f176960b;
        return wsv0.f254763e;
    }

    @Override // p204p.AbstractC2329r8
    /* JADX INFO: renamed from: h */
    public final Iterator mo43934h() {
        return new yf40(this);
    }

    @Override // p204p.AbstractC2329r8, p204p.eai0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public xf40 mo38300b() {
        return this.f208460e;
    }

    @Override // p204p.AbstractC2329r8, p204p.eai0
    public final Set keySet() {
        return this.f208460e.keySet();
    }

    @Override // p204p.AbstractC2329r8, p204p.eai0
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.eai0
    public final int size() {
        return this.f208461f;
    }
}
