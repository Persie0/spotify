package androidx.car.app.model;

import java.util.Objects;
import p204p.dq60;
import p204p.kg41;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class SpotlightSection extends Section<CondensedItem> {
    private final CarIcon mImage;

    private SpotlightSection() {
        this.mImage = null;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpotlightSection)) {
            return false;
        }
        SpotlightSection spotlightSection = (SpotlightSection) obj;
        return super.equals(spotlightSection) && Objects.equals(this.mImage, spotlightSection.mImage);
    }

    public CarIcon getImage() {
        CarIcon carIcon = this.mImage;
        Objects.requireNonNull(carIcon);
        return carIcon;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.mImage);
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        StringBuilder sb = new StringBuilder("SpotlightSection { image: ");
        sb.append(this.mImage);
        sb.append(", ");
        return dq60.m36616p(super.toString(), " }", sb);
    }

    private SpotlightSection(kg41 kg41Var) {
        super(kg41Var);
        throw null;
    }
}
