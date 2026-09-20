package androidx.car.app.model;

import java.util.Objects;
import p204p.edb;
import p204p.rzb;
import p204p.uzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class SectionedItemList {
    private final CarText mHeader;
    private final ItemList mItemList;

    private SectionedItemList(ItemList itemList, CarText carText) {
        this.mItemList = itemList;
        this.mHeader = carText;
    }

    public static SectionedItemList create(ItemList itemList, CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        CarText carTextCreate = CarText.create(charSequence);
        uzb.f235457e.m84293b(carTextCreate);
        Objects.requireNonNull(itemList);
        return new SectionedItemList(itemList, carTextCreate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionedItemList)) {
            return false;
        }
        SectionedItemList sectionedItemList = (SectionedItemList) obj;
        return Objects.equals(this.mItemList, sectionedItemList.mItemList) && Objects.equals(this.mHeader, sectionedItemList.mHeader);
    }

    public CarText getHeader() {
        CarText carText = this.mHeader;
        Objects.requireNonNull(carText);
        return carText;
    }

    public ItemList getItemList() {
        ItemList itemList = this.mItemList;
        Objects.requireNonNull(itemList);
        return itemList;
    }

    public int hashCode() {
        return Objects.hash(this.mItemList, this.mHeader);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ items: ");
        sb.append(this.mItemList);
        sb.append(", has header: ");
        return edb.m38570s(sb, this.mHeader != null, "]");
    }

    private SectionedItemList() {
        this.mItemList = null;
        this.mHeader = null;
    }
}
