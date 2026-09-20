package p204p;

import com.google.common.collect.BiMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ze40 extends xf40 implements BiMap {
    /* JADX INFO: renamed from: q */
    public static ze40 m95963q(HashMap map) {
        Set setEntrySet = map.entrySet();
        xe40 xe40Var = new xe40(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        xe40Var.m90436i(setEntrySet);
        return xe40Var.mo85344d();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p204p.xf40
    /* JADX INFO: renamed from: f */
    public final ef40 mo30474f() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.BiMap
    public final Object forcePut(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // p204p.xf40
    /* JADX INFO: renamed from: p */
    public final ef40 values() {
        return ((vsv0) this).f244505h.keySet();
    }

    @Override // p204p.xf40, java.util.Map
    public final Collection values() {
        return ((vsv0) this).f244505h.keySet();
    }

    @Override // p204p.xf40
    public Object writeReplace() {
        return new ye40(this);
    }

    @Override // p204p.xf40, java.util.Map
    public final Set values() {
        return ((vsv0) this).f244505h.keySet();
    }
}
