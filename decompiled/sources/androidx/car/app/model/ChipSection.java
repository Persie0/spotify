package androidx.car.app.model;

import java.util.Objects;
import p204p.e6e;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class ChipSection extends Section<Chip> {
    private final ChipStyle mStyle;

    public ChipSection(e6e e6eVar) {
        super(e6eVar);
        throw null;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipSection)) {
            return false;
        }
        ChipSection chipSection = (ChipSection) obj;
        return super.equals(chipSection) && Objects.equals(this.mStyle, chipSection.mStyle);
    }

    public ChipStyle getStyle() {
        return this.mStyle;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.mStyle);
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        return "ChipSection{items=" + getItemsDelegate() + ", title=" + getTitle() + ", style=" + this.mStyle + "}";
    }

    private ChipSection() {
        this.mStyle = null;
    }
}
