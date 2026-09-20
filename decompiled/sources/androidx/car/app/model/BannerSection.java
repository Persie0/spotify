package androidx.car.app.model;

import java.util.Objects;
import p204p.dq60;
import p204p.rv8;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class BannerSection extends Section<Banner> {
    public BannerSection() {
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof BannerSection) {
            return super.equals((BannerSection) obj);
        }
        return false;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()));
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return dq60.m36616p(super.toString(), " }", new StringBuilder("BannerSection { "));
    }

    public BannerSection(rv8 rv8Var) {
        super(rv8Var);
    }
}
