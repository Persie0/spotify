package androidx.car.app.model;

import java.util.Objects;
import p204p.dq60;
import p204p.i020;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class GridSection extends Section<GridItem> {
    public static final int ITEM_IMAGE_SHAPE_CIRCLE = 2;
    public static final int ITEM_IMAGE_SHAPE_UNSET = 1;
    public static final int ITEM_SIZE_EXTRA_LARGE = 4;
    public static final int ITEM_SIZE_LARGE = 3;
    public static final int ITEM_SIZE_MEDIUM = 2;
    public static final int ITEM_SIZE_SMALL = 1;
    private final int mItemImageShape;
    private final int mItemSize;

    public /* synthetic */ GridSection(i020 i020Var, int i) {
        this(i020Var);
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GridSection)) {
            return false;
        }
        GridSection gridSection = (GridSection) obj;
        return super.equals(gridSection) && this.mItemImageShape == gridSection.mItemImageShape && this.mItemSize == gridSection.mItemSize;
    }

    public int getItemImageShape() {
        return this.mItemImageShape;
    }

    public int getItemSize() {
        return this.mItemSize;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Integer.valueOf(this.mItemImageShape), Integer.valueOf(this.mItemSize));
    }

    @Override // androidx.car.app.model.Section
    public String toString() {
        StringBuilder sb = new StringBuilder("GridSection { itemSize: ");
        sb.append(this.mItemSize);
        sb.append(", itemImageShape: ");
        sb.append(this.mItemImageShape);
        sb.append(", ");
        return dq60.m36616p(super.toString(), " }", sb);
    }

    private GridSection() {
        this.mItemSize = 1;
        this.mItemImageShape = 1;
    }

    private GridSection(i020 i020Var) {
        super(i020Var);
        this.mItemSize = i020Var.f97101f;
        this.mItemImageShape = i020Var.f97102g;
    }
}
