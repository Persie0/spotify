package p204p;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0f1 extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final Object[] f86279b = new Object[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f86280c = new Object[0];

    /* JADX INFO: renamed from: d */
    public static final Object[] f86281d = new Object[0];

    /* JADX INFO: renamed from: e */
    public static final Object[] f86282e = new Object[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f86283f = new Object[0];

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f86284a;

    /* JADX INFO: renamed from: a */
    public abstract int mo46350a(Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f86284a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f86284a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo46351b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f86284a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo46352d();

    /* JADX INFO: renamed from: e */
    public abstract Object[] mo46353e();

    /* JADX INFO: renamed from: f */
    public abstract int mo35478f(Object[] objArr);

    /* JADX INFO: renamed from: i */
    public int mo46354i() {
        switch (this.f86284a) {
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: j */
    public Object[] mo28833j() {
        switch (this.f86284a) {
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public int mo28834l() {
        switch (this.f86284a) {
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: m */
    public int mo28835m() {
        switch (this.f86284a) {
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: n */
    public Object[] mo46355n() {
        switch (this.f86284a) {
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo28836o(Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f86284a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f86284a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f86284a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        switch (this.f86284a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        switch (this.f86284a) {
            case 0:
                return toArray(f86279b);
            case 1:
                return toArray(f86280c);
            case 2:
                return toArray(f86281d);
            case 3:
                return toArray(f86282e);
            default:
                return toArray(f86283f);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f86284a) {
            case 0:
                objArr.getClass();
                int size = size();
                int length = objArr.length;
                if (length < size) {
                    Object[] objArrMo46353e = mo46353e();
                    if (objArrMo46353e == null) {
                        if (length != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size);
                    } else {
                        return Arrays.copyOfRange(objArrMo46353e, mo46352d(), mo46351b(), objArr.getClass());
                    }
                } else if (length > size) {
                    objArr[size] = null;
                }
                mo46350a(objArr);
                return objArr;
            case 1:
                objArr.getClass();
                int size2 = size();
                int length2 = objArr.length;
                if (length2 < size2) {
                    Object[] objArrMo46355n = mo46355n();
                    if (objArrMo46355n == null) {
                        if (length2 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size2);
                    } else {
                        return Arrays.copyOfRange(objArrMo46355n, mo28834l(), mo46354i(), objArr.getClass());
                    }
                } else if (length2 > size2) {
                    objArr[size2] = null;
                }
                mo35478f(objArr);
                return objArr;
            case 2:
                objArr.getClass();
                int size3 = size();
                int length3 = objArr.length;
                if (length3 < size3) {
                    Object[] objArrMo28833j = mo28833j();
                    if (objArrMo28833j == null) {
                        if (length3 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size3);
                    } else {
                        return Arrays.copyOfRange(objArrMo28833j, mo28834l(), mo28835m(), objArr.getClass());
                    }
                } else if (length3 > size3) {
                    objArr[size3] = null;
                }
                mo28836o(objArr);
                return objArr;
            case 3:
                objArr.getClass();
                int size4 = size();
                int length4 = objArr.length;
                if (length4 < size4) {
                    Object[] objArrMo46355n2 = mo46355n();
                    if (objArrMo46355n2 == null) {
                        if (length4 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size4);
                    } else {
                        return Arrays.copyOfRange(objArrMo46355n2, mo28834l(), mo46354i(), objArr.getClass());
                    }
                } else if (length4 > size4) {
                    objArr[size4] = null;
                }
                mo35478f(objArr);
                return objArr;
            default:
                objArr.getClass();
                int size5 = size();
                int length5 = objArr.length;
                if (length5 < size5) {
                    Object[] objArrMo28833j2 = mo28833j();
                    if (objArrMo28833j2 == null) {
                        if (length5 != 0) {
                            objArr = Arrays.copyOf(objArr, 0);
                        }
                        objArr = Arrays.copyOf(objArr, size5);
                    } else {
                        return Arrays.copyOfRange(objArrMo28833j2, mo28834l(), mo28835m(), objArr.getClass());
                    }
                } else if (length5 > size5) {
                    objArr[size5] = null;
                }
                mo28836o(objArr);
                return objArr;
        }
    }
}
