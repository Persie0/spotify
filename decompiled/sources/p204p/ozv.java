package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class ozv implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Class f172372a;

    public ozv(Enum[] enumArr) {
        Class<?> componentType = enumArr.getClass().getComponentType();
        wj50.m88279p(componentType);
        this.f172372a = componentType;
    }

    private final Object readResolve() {
        return new nzv((Enum[]) this.f172372a.getEnumConstants());
    }
}
