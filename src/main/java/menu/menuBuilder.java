package menu;

import java.util.List;

public class menuBuilder {
    private Long id;
    private Long parentId;
    private String name;
    private String url;
    private String icon;
    private boolean selected;
    private List<Menu> childrens;

    public menuBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public menuBuilder setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public menuBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public menuBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public menuBuilder setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public menuBuilder setSelected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public menuBuilder setChildrens(List<Menu> childrens) {
        this.childrens = childrens;
        return this;
    }

    public Menu createMenu() {
        return new Menu(id, parentId, name, url, icon, selected, childrens);
    }
}