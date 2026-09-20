package androidx.car.app.model;

import java.util.Objects;
import p204p.f6e;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class ChipStyle {
    private final CarColor mBackgroundColor;
    private final CarColor mContentColor;
    private final CarColor mOutlineColor;
    private final Shape mShape;

    public ChipStyle(f6e f6eVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipStyle)) {
            return false;
        }
        ChipStyle chipStyle = (ChipStyle) obj;
        return Objects.equals(this.mBackgroundColor, chipStyle.mBackgroundColor) && Objects.equals(this.mContentColor, chipStyle.mContentColor) && Objects.equals(this.mOutlineColor, chipStyle.mOutlineColor) && Objects.equals(this.mShape, chipStyle.mShape);
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public CarColor getContentColor() {
        return this.mContentColor;
    }

    public CarColor getOutlineColor() {
        return this.mOutlineColor;
    }

    public Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return Objects.hash(this.mBackgroundColor, this.mContentColor, this.mOutlineColor, this.mShape);
    }

    public String toString() {
        return "ChipStyle{backgroundColor=" + this.mBackgroundColor + ", contentColor=" + this.mContentColor + ", outlineColor=" + this.mOutlineColor + ", shape=" + this.mShape + "}";
    }

    private ChipStyle() {
        this.mBackgroundColor = null;
        this.mContentColor = null;
        this.mOutlineColor = null;
        this.mShape = null;
    }
}
