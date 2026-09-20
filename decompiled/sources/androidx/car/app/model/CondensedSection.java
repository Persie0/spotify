package androidx.car.app.model;

import p204p.dhi;
import p204p.dq60;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class CondensedSection extends Section<CondensedItem> {
    public /* synthetic */ CondensedSection(dhi dhiVar, int i) {
        this(dhiVar);
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CondensedSection) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return dq60.m36616p(super.toString(), " }", new StringBuilder("CondensedSection { "));
    }

    private CondensedSection(dhi dhiVar) {
        super(dhiVar);
    }

    private CondensedSection() {
    }
}
