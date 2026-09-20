package androidx.car.app.model;

import java.util.Objects;
import p204p.chi;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class CondensedItemStyle {
    private final Background mBackground;
    private final Shape mShape;

    public /* synthetic */ CondensedItemStyle(chi chiVar, int i) {
        this(chiVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CondensedItemStyle)) {
            return false;
        }
        CondensedItemStyle condensedItemStyle = (CondensedItemStyle) obj;
        return Objects.equals(this.mShape, condensedItemStyle.mShape) && Objects.equals(this.mBackground, condensedItemStyle.mBackground);
    }

    public Background getBackground() {
        return this.mBackground;
    }

    public Shape getShape() {
        return this.mShape;
    }

    public int hashCode() {
        return Objects.hash(this.mShape, this.mBackground);
    }

    public String toString() {
        return "CondensedItemStyle { shape: " + this.mShape + ", background: " + this.mBackground + " }";
    }

    private CondensedItemStyle(chi chiVar) {
        this.mShape = chiVar.f38022a;
        this.mBackground = chiVar.f38023b;
    }

    private CondensedItemStyle() {
        this.mShape = null;
        this.mBackground = null;
    }
}
