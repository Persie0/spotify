package androidx.car.app.model;

import androidx.car.app.messaging.model.ConversationItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p204p.g690;
import p204p.h690;
import p204p.kr50;
import p204p.oe20;
import p204p.pnk;
import p204p.rzb;
import p204p.ty61;
import p204p.wdg1;
import p204p.ys50;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class ListTemplate implements ty61 {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;

    @Deprecated
    private final ActionStrip mActionStrip;
    private final List<Action> mActions;
    private final Header mHeader;

    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;
    private final List<SectionedItemList> mSectionedLists;
    private final ItemList mSingleList;

    @Deprecated
    private final CarText mTitle;

    public ListTemplate(g690 g690Var) {
        this.mIsLoading = g690Var.f76961a;
        this.mTitle = g690Var.f76964d;
        this.mHeaderAction = g690Var.f76965e;
        this.mSingleList = g690Var.f76962b;
        this.mSectionedLists = wdg1.m87845s(g690Var.f76963c);
        this.mActionStrip = g690Var.f76966f;
        this.mActions = wdg1.m87845s(g690Var.f76967g);
        this.mHeader = g690Var.f76968h;
    }

    public static List<SectionedItemList> getTruncatedCopy(List<SectionedItemList> list) {
        h690 h690Var = new h690();
        h690Var.f88046a = 100;
        ArrayList arrayList = new ArrayList();
        for (SectionedItemList sectionedItemList : list) {
            arrayList.add(SectionedItemList.create(truncate(sectionedItemList.getItemList(), h690Var), sectionedItemList.getHeader().toCharSequence()));
            if (h690Var.f88046a <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static ItemList truncate(ItemList itemList, h690 h690Var) {
        ys50 ys50Var = new ys50(itemList);
        ArrayList arrayList = ys50Var.f275689a;
        arrayList.clear();
        for (kr50 kr50Var : itemList.getItems()) {
            if (!(kr50Var instanceof ConversationItem)) {
                if (h690Var.f88046a < 1) {
                    break;
                }
                Objects.requireNonNull(kr50Var);
                arrayList.add(kr50Var);
                h690Var.f88046a--;
            } else {
                ConversationItem conversationItem = (ConversationItem) kr50Var;
                if (h690Var.f88046a < 2) {
                    break;
                }
                pnk pnkVar = new pnk(conversationItem);
                int i = h690Var.f88046a - 1;
                h690Var.f88046a = i;
                int iMin = Math.min(i, 10);
                int size = conversationItem.getMessages().size();
                int iMin2 = Math.min(size, iMin);
                pnkVar.f179428f = conversationItem.getMessages().subList(size - iMin2, size);
                arrayList.add(new ConversationItem(pnkVar));
                h690Var.f88046a -= iMin2;
            }
        }
        return ys50Var.m94429a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListTemplate)) {
            return false;
        }
        ListTemplate listTemplate = (ListTemplate) obj;
        return this.mIsLoading == listTemplate.mIsLoading && Objects.equals(this.mTitle, listTemplate.mTitle) && Objects.equals(this.mHeaderAction, listTemplate.mHeaderAction) && Objects.equals(this.mSingleList, listTemplate.mSingleList) && Objects.equals(this.mSectionedLists, listTemplate.mSectionedLists) && Objects.equals(this.mActionStrip, listTemplate.mActionStrip) && Objects.equals(this.mActions, listTemplate.mActions) && Objects.equals(this.mHeader, listTemplate.mHeader);
    }

    @Deprecated
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public Header getHeader() {
        Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        oe20 oe20Var = new oe20();
        CarText carText = this.mTitle;
        if (carText != null) {
            oe20Var.m66787d(carText);
        }
        Action action = this.mHeaderAction;
        if (action != null) {
            oe20Var.m66786c(action);
        }
        ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            Iterator<Action> it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                oe20Var.m66784a(it.next());
            }
        }
        return oe20Var.m66785b();
    }

    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public List<SectionedItemList> getSectionedLists() {
        List<SectionedItemList> list = this.mSectionedLists;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public ItemList getSingleList() {
        return this.mSingleList;
    }

    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mSectionedLists, this.mActionStrip, this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public g690 toBuilder() {
        return new g690(this);
    }

    public String toString() {
        return "ListTemplate";
    }

    private ListTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        List list = Collections.EMPTY_LIST;
        this.mSectionedLists = list;
        this.mActionStrip = null;
        this.mActions = list;
        this.mHeader = null;
    }
}
