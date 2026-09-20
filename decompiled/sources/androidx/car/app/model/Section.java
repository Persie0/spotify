package androidx.car.app.model;

import androidx.car.app.serialization.ListDelegateImpl;
import java.util.Collections;
import java.util.Objects;
import p204p.kr50;
import p204p.n5z0;
import p204p.rzb;
import p204p.vq80;
import p204p.wal0;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public abstract class Section<T extends kr50> {
    private final vq80 mItemsDelegate;
    private final CarText mNoItemsMessage;
    private final wal0 mOnItemVisibilityChangedDelegate;
    private final SectionHeader mSectionHeader;
    private final CarText mTitle;

    public Section() {
        this.mItemsDelegate = new ListDelegateImpl(Collections.EMPTY_LIST);
        this.mTitle = null;
        this.mSectionHeader = null;
        this.mNoItemsMessage = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        if (Objects.equals(this.mItemsDelegate, section.mItemsDelegate) && Objects.equals(this.mTitle, section.mTitle) && Objects.equals(this.mSectionHeader, section.mSectionHeader) && Objects.equals(this.mNoItemsMessage, section.mNoItemsMessage)) {
            if (Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null).equals(Boolean.valueOf(section.mOnItemVisibilityChangedDelegate == null))) {
                return true;
            }
        }
        return false;
    }

    public vq80 getItemsDelegate() {
        return this.mItemsDelegate;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public wal0 getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public SectionHeader getSectionHeader() {
        return this.mSectionHeader;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mItemsDelegate, this.mTitle, this.mSectionHeader, this.mNoItemsMessage, Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Section { title: ");
        sb.append(this.mTitle);
        sb.append(", sectionHeader: ");
        sb.append(this.mSectionHeader);
        sb.append(", noItemsMessage: ");
        sb.append(this.mNoItemsMessage);
        sb.append(", itemsDelegate: ");
        sb.append(this.mItemsDelegate);
        sb.append(", onItemVisibilityChangedDelegate: ");
        sb.append(this.mOnItemVisibilityChangedDelegate != null);
        return sb.toString();
    }

    public Section(n5z0 n5z0Var) {
        this.mItemsDelegate = new ListDelegateImpl(Collections.unmodifiableList(n5z0Var.f150642a));
        this.mTitle = n5z0Var.f150643b;
        this.mSectionHeader = n5z0Var.f150644c;
        this.mNoItemsMessage = n5z0Var.f150645d;
        this.mOnItemVisibilityChangedDelegate = n5z0Var.f150646e;
    }
}
