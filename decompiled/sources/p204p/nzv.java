package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class nzv extends AbstractC2154n7 implements lzv, RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public final Enum[] f160175a;

    public nzv(Enum[] enumArr) {
        this.f160175a = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new ozv(this.f160175a);
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f160175a.length;
    }

    @Override // p204p.AbstractC2282q6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        return ((Enum) bk5.m29587J0(r4.ordinal(), this.f160175a)) == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f160175a;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(s571.m77247f(i, "index: ", length, ", size: "));
        }
        return enumArr[i];
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) bk5.m29587J0(iOrdinal, this.f160175a)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p204p.AbstractC2154n7, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) bk5.m29587J0(iOrdinal, this.f160175a)) == r4) {
            return iOrdinal;
        }
        return -1;
    }
}
