package p204p;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class pov0 extends tov0 implements ce60 {

    /* JADX INFO: renamed from: b */
    public final Constructor f179808b;

    public pov0(Constructor constructor) {
        this.f179808b = constructor;
    }

    @Override // p204p.ce60
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f179808b.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new zov0(typeVariable));
        }
        return arrayList;
    }

    @Override // p204p.tov0
    /* JADX INFO: renamed from: t */
    public final Member mo70492t() {
        return this.f179808b;
    }

    /* JADX INFO: renamed from: x */
    public final Constructor m70493x() {
        return this.f179808b;
    }
}
