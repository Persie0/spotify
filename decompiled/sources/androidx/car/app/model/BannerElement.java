package androidx.car.app.model;

import java.util.Objects;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class BannerElement {
    public static final int TYPE_ACTION = 1;
    public static final int TYPE_ICON = 2;
    public static final int TYPE_IMAGE = 3;
    private final Action mAction;
    private final CarIcon mIcon;
    private final int mType;

    public BannerElement(int i, Action action, CarIcon carIcon) {
        this.mType = i;
        this.mAction = action;
        this.mIcon = carIcon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerElement)) {
            return false;
        }
        BannerElement bannerElement = (BannerElement) obj;
        return this.mType == bannerElement.mType && Objects.equals(this.mAction, bannerElement.mAction) && Objects.equals(this.mIcon, bannerElement.mIcon);
    }

    public Action getAction() {
        return this.mAction;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mType), this.mAction, this.mIcon);
    }

    public String toString() {
        return "[type: " + this.mType + ", action: " + this.mAction + ", icon: " + this.mIcon + "]";
    }

    private BannerElement() {
        this.mType = 1;
        this.mAction = null;
        this.mIcon = null;
    }
}
