package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p204p.fdl0;
import p204p.klh;
import p204p.kr50;
import p204p.p7l0;
import p204p.rzb;
import p204p.wal0;
import p204p.wdg1;
import p204p.ys50;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class ItemList {
    private final List<kr50> mItems;
    private final CarText mNoItemsMessage;
    private final wal0 mOnItemVisibilityChangedDelegate;
    private final fdl0 mOnSelectedDelegate;
    private final int mSelectedIndex;

    public ItemList(ys50 ys50Var) {
        this.mSelectedIndex = ys50Var.f275690b;
        this.mItems = wdg1.m87845s(ys50Var.f275689a);
        this.mNoItemsMessage = ys50Var.f275693e;
        this.mOnSelectedDelegate = ys50Var.f275691c;
        this.mOnItemVisibilityChangedDelegate = ys50Var.f275692d;
    }

    public static p7l0 getOnClickDelegate(kr50 kr50Var) {
        if (kr50Var instanceof Row) {
            return ((Row) kr50Var).getOnClickDelegate();
        }
        if (kr50Var instanceof GridItem) {
            return ((GridItem) kr50Var).getOnClickDelegate();
        }
        return null;
    }

    public static Toggle getToggle(kr50 kr50Var) {
        if (kr50Var instanceof Row) {
            return ((Row) kr50Var).getToggle();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        if (this.mSelectedIndex == itemList.mSelectedIndex && Objects.equals(this.mItems, itemList.mItems)) {
            if (Boolean.valueOf(this.mOnSelectedDelegate == null).equals(Boolean.valueOf(itemList.mOnSelectedDelegate == null))) {
                if (Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null).equals(Boolean.valueOf(itemList.mOnItemVisibilityChangedDelegate == null)) && Objects.equals(this.mNoItemsMessage, itemList.mNoItemsMessage)) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<kr50> getItems() {
        List<kr50> list = this.mItems;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarText getNoItemsMessage() {
        return this.mNoItemsMessage;
    }

    public wal0 getOnItemVisibilityChangedDelegate() {
        return this.mOnItemVisibilityChangedDelegate;
    }

    public fdl0 getOnSelectedDelegate() {
        return this.mOnSelectedDelegate;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mSelectedIndex), this.mItems, Boolean.valueOf(this.mOnSelectedDelegate == null), Boolean.valueOf(this.mOnItemVisibilityChangedDelegate == null), this.mNoItemsMessage);
    }

    public ys50 toBuilder() {
        return new ys50(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        List<kr50> list = this.mItems;
        sb.append(list != null ? list.toString() : null);
        sb.append(", selected: ");
        return klh.m56832d(this.mSelectedIndex, "]", sb);
    }

    private ItemList() {
        this.mSelectedIndex = 0;
        this.mItems = Collections.EMPTY_LIST;
        this.mNoItemsMessage = null;
        this.mOnSelectedDelegate = null;
        this.mOnItemVisibilityChangedDelegate = null;
    }
}
