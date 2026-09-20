package androidx.car.app.model;

import java.util.Objects;
import p204p.kr50;
import p204p.p4e;
import p204p.p7l0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Chip implements kr50 {
    private final CarIcon mEndIcon;
    private final boolean mIsSelected;
    private final p7l0 mOnClickDelegate;
    private final CarIcon mStartIcon;
    private final ChipStyle mStyle;
    private final CarText mTitle;

    public Chip(p4e p4eVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Chip)) {
            return false;
        }
        Chip chip = (Chip) obj;
        if (Objects.equals(this.mTitle, chip.mTitle) && Objects.equals(this.mStartIcon, chip.mStartIcon) && Objects.equals(this.mEndIcon, chip.mEndIcon) && this.mIsSelected == chip.mIsSelected) {
            if (Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(chip.mOnClickDelegate == null)) && Objects.equals(this.mStyle, chip.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public CarIcon getEndIcon() {
        return this.mEndIcon;
    }

    public p7l0 getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarIcon getStartIcon() {
        return this.mStartIcon;
    }

    public ChipStyle getStyle() {
        return this.mStyle;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mStartIcon, this.mEndIcon, Boolean.valueOf(this.mIsSelected), Boolean.valueOf(this.mOnClickDelegate == null), this.mStyle);
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public String toString() {
        return "Chip{title=" + this.mTitle + ", startIcon=" + this.mStartIcon + ", endIcon=" + this.mEndIcon + ", isSelected=" + this.mIsSelected + ", onClickDelegate=" + this.mOnClickDelegate + ", style=" + this.mStyle + "}";
    }

    private Chip() {
        this.mTitle = null;
        this.mStartIcon = null;
        this.mEndIcon = null;
        this.mIsSelected = false;
        this.mOnClickDelegate = null;
        this.mStyle = null;
    }
}
