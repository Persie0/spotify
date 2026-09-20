package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p204p.rzb;
import p204p.ty61;
import p204p.y9z0;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class SectionedItemTemplate implements ty61 {
    public static final int ALPHABETICAL_INDEXING_DISABLED = 0;
    public static final int ALPHABETICAL_INDEXING_TITLE_AS_IS = 1;
    public static final int ALPHABETICAL_INDEXING_TITLE_IGNORE_ARTICLES_AND_SYMBOLS = 2;
    public static final int SCROLL_STATE_PRESERVE_INDEX = 1;
    public static final int SCROLL_STATE_RESET_TO_TOP = 0;
    private final List<Action> mActions;
    private final int mAlphabeticalIndexingStrategy;
    private final Header mHeader;

    @Deprecated
    private final boolean mIsAlphabeticalIndexingAllowed;
    private final boolean mIsLoading;
    private final int mScrollStatePersistenceStrategy;
    private final List<Section<?>> mSections;

    public /* synthetic */ SectionedItemTemplate(y9z0 y9z0Var, int i) {
        this(y9z0Var);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SectionedItemTemplate)) {
            return false;
        }
        SectionedItemTemplate sectionedItemTemplate = (SectionedItemTemplate) obj;
        return Objects.equals(this.mSections, sectionedItemTemplate.mSections) && Objects.equals(this.mActions, sectionedItemTemplate.mActions) && Objects.equals(this.mHeader, sectionedItemTemplate.mHeader) && this.mIsLoading == sectionedItemTemplate.mIsLoading && this.mIsAlphabeticalIndexingAllowed == sectionedItemTemplate.mIsAlphabeticalIndexingAllowed && this.mScrollStatePersistenceStrategy == sectionedItemTemplate.mScrollStatePersistenceStrategy;
    }

    public List<Action> getActions() {
        return this.mActions;
    }

    public int getAlphabeticalIndexingStrategy() {
        int i = this.mAlphabeticalIndexingStrategy;
        if (i == 0 && this.mIsAlphabeticalIndexingAllowed) {
            return 2;
        }
        return i;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public int getScrollStatePersistenceStrategy() {
        return this.mScrollStatePersistenceStrategy;
    }

    public List<Section<?>> getSections() {
        return this.mSections;
    }

    public int hashCode() {
        return Objects.hash(this.mSections, this.mActions, this.mHeader, Boolean.valueOf(this.mIsLoading), Boolean.valueOf(this.mIsAlphabeticalIndexingAllowed), Integer.valueOf(this.mScrollStatePersistenceStrategy));
    }

    @Deprecated
    public boolean isAlphabeticalIndexingAllowed() {
        return this.mIsAlphabeticalIndexingAllowed;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        return "SectionedItemTemplate";
    }

    private SectionedItemTemplate() {
        List list = Collections.EMPTY_LIST;
        this.mSections = list;
        this.mActions = list;
        this.mHeader = null;
        this.mIsLoading = false;
        this.mIsAlphabeticalIndexingAllowed = false;
        this.mAlphabeticalIndexingStrategy = 0;
        this.mScrollStatePersistenceStrategy = 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    private SectionedItemTemplate(y9z0 y9z0Var) {
        this.mSections = Collections.unmodifiableList(y9z0Var.f270698a);
        this.mActions = Collections.unmodifiableList(y9z0Var.f270699b);
        this.mHeader = y9z0Var.f270700c;
        this.mIsLoading = y9z0Var.f270701d;
        this.mIsAlphabeticalIndexingAllowed = y9z0Var.f270702e;
        this.mAlphabeticalIndexingStrategy = 0;
        this.mScrollStatePersistenceStrategy = y9z0Var.f270703f;
    }
}
