package p204p;

import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ys50 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f275689a;

    /* JADX INFO: renamed from: b */
    public final int f275690b;

    /* JADX INFO: renamed from: c */
    public final fdl0 f275691c;

    /* JADX INFO: renamed from: d */
    public final wal0 f275692d;

    /* JADX INFO: renamed from: e */
    public CarText f275693e;

    public ys50() {
        this.f275689a = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final ItemList m94429a() {
        if (this.f275691c != null) {
            ArrayList<kr50> arrayList = this.f275689a;
            int size = arrayList.size();
            if (size == 0) {
                throw new IllegalStateException("A selectable list cannot be empty");
            }
            int i = this.f275690b;
            if (i >= size) {
                throw new IllegalStateException(edb.m38560i(i, size, "The selected item index (", ") is larger than the size of the list (", ")"));
            }
            for (kr50 kr50Var : arrayList) {
                if (ItemList.getOnClickDelegate(kr50Var) != null) {
                    throw new IllegalStateException("Items that belong to selectable lists can't have an onClickListener. Use the OnSelectedListener of the list instead");
                }
                if (ItemList.getToggle(kr50Var) != null) {
                    throw new IllegalStateException("Items that belong to selectable lists can't have a toggle");
                }
            }
        }
        return new ItemList(this);
    }

    public ys50(ItemList itemList) {
        this.f275690b = itemList.getSelectedIndex();
        this.f275691c = itemList.getOnSelectedDelegate();
        this.f275692d = itemList.getOnItemVisibilityChangedDelegate();
        this.f275693e = itemList.getNoItemsMessage();
        this.f275689a = new ArrayList(itemList.getItems());
    }
}
