package androidx.car.app.model;

import java.util.Objects;
import p204p.ek8;
import p204p.rzb;
import p204p.txb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Background {
    public static final Background TRANSPARENT;
    private final CarColor mColor;
    private final CarIcon mImage;

    static {
        ek8 ek8Var = new ek8();
        CarColor carColorCreateCustom = CarColor.createCustom(0, 0);
        txb.f224663b.m81899a(carColorCreateCustom);
        ek8Var.f60396a = carColorCreateCustom;
        TRANSPARENT = new Background(ek8Var);
    }

    public Background(ek8 ek8Var) {
        this.mColor = ek8Var.f60396a;
        this.mImage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Background)) {
            return false;
        }
        Background background = (Background) obj;
        return Objects.equals(this.mImage, background.mImage) && Objects.equals(this.mColor, background.mColor);
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public int hashCode() {
        return Objects.hashCode(this.mImage);
    }

    public String toString() {
        return "Background [image: " + this.mImage + ", color: " + this.mColor + "]";
    }

    private Background() {
        this.mColor = null;
        this.mImage = null;
    }
}
